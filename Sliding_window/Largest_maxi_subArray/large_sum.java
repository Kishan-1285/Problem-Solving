package Sliding_window.Largest_maxi_subArray;

class Main {
    public static void main(String[] args) {
        int k = 3;
        int windowSum = 0;
        int [] arr = {1,2,3,4,5,6,7};
        for(int i=0;i<k;i++){
            windowSum += arr[i];
       }
        int largest = windowSum;
        // System.out.println(windowSum);
        for(int i=0;i+k<arr.length;i++){
            windowSum = windowSum - arr[i] + arr[k];
            if(windowSum>largest){
                largest = windowSum;
           }
        }
       System.out.println(largest);
    }
}