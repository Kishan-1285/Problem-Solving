
package two_pointer.RemoveDuplicatesFromSortedArray;

import java.util.*;
class Main {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,4,4,5};
        
        int slow = 0;
        int fast = 1;
          
        while(fast<arr.length){
            if(arr[slow]==arr[fast]){
                fast++;
            }else if(arr[slow]!=arr[fast]){
                arr[slow+1] = arr[fast];
                slow++;
                fast++;
            }
        }
         int [] subArray = Arrays.copyOfRange(arr, 0, slow+1);
         System.out.println(Arrays.toString(subArray));
         
    }
}