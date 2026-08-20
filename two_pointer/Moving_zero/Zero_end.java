package two_pointer.Moving_zero;

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        int slow = 0;
        int fast = 0;
        while (fast < arr.length) {
            if (arr[fast] != 0) {
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = temp;

                slow++;
            }
            fast++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
