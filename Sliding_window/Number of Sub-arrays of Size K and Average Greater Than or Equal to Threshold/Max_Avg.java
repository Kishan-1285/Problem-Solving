class Max_Avg {
    public static void main(String[] args) {
        int [] arr = {2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;
        int count = 0;
        int windowSum = 0;
        for(int i=0;i<k;i++){
            windowSum += arr[i];
        }
        if(windowSum/k>=threshold){
                count++;
            }
        for(int i=0;i+k<arr.length;i++){
            windowSum = windowSum - arr[i] + arr[i+k];
            if(windowSum/k>=threshold){
                count++;
            }
        }
        System.out.println(count);
    }
}