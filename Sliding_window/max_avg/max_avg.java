
package max_avg;

public class max_avg {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,9,4};
        int k = 3;
        int windowSum = 0;
        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        int largest = windowSum;
        System.out.println(windowSum);
        for(int i=0;i+k<arr.length;i++){
            windowSum = windowSum - arr[i] + arr[i+k];
             System.out.println(windowSum);
             if(largest<windowSum){
                 largest = windowSum;
             }
        }
            double average = (double)largest/k;
            System.out.println(average);
             System.out.println("the largest average of the sub array is "+average);
    }
}