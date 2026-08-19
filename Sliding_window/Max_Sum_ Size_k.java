class Max_Sum_Size_k {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int k =3;
        int windowSum = 0;
        
        for(int i=0;i<k;i++){
            windowSum = windowSum+arr[i];
        }
            System.out.println(windowSum);
        int i = 0;
        while(i+k<arr.length){
            windowSum = windowSum - arr[i] + arr[i+k];
        System.out.println(windowSum);
            i++;
        }
    }
    }
