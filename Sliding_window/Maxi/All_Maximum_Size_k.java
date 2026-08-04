package Sliding_window.Maxi;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class All_Maximum_Size_k {
    static int[] allMaximumSizeK(int[] arr, int k) {
        if (arr.length < k || k <= 0) {
            return new int[0];
        }

        int[] ans = new int[arr.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {
                ans[i - k + 1] = arr[deque.peekFirst()];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.println(Arrays.toString(allMaximumSizeK(arr, k)));
    }
}
