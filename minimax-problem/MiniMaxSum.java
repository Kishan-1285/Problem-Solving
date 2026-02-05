import java.util.*;

public class MiniMaxSum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            long[] arr = new long[5];
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextLong();  
            }

            long totalSum = 0;
            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;

            for (long x : arr) {
                totalSum += x;
                min = Math.min(min, x);
                max = Math.max(max, x);
            }

            System.out.println((totalSum - max) + " " + (totalSum - min));
            sc.close();
        }
}
