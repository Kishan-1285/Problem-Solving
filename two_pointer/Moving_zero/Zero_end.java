package two_pointer.Moving_zero;

import java.util.*;

class Main {
    public static void main(String[] args) {
        int []arr = {1,2,0,0,4,3,0};
        
        int slow = 0;
        int fast = 0;
        
        while(fast<arr.length){
            if(arr[fast]!=0&&arr[slow]!=0){
                fast++;
                slow++;
            }
            else if(arr[fast]==0&&arr[slow]==0){
                fast++;
            }
            else if(arr[slow]==0&&arr[fast]!=0){
                    int temp = arr[fast];
                    arr[fast] = arr[slow];
                    arr[slow] = temp;
                    fast++;
                    slow++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
