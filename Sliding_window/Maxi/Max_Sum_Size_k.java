package Maxi;

class Max_Sum_Size_k {
    static int maxSumSizeK(int[] arr, int k) {
        if (arr.length < k || k <= 0) {
            return -1;
        }

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 3;

        System.out.println(maxSumSizeK(arr, k));
    }
}
