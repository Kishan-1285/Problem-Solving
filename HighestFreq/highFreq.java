package HighestFreq;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class highFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        // for array 
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // for finding the frequency of the elements in the array
        for(int i=0;i<n;i++){
            int num = arr[i];
            if(map.containsKey(arr[i])){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        int highFreq = 0;
        int answer = 0;
        for(Integer key : map.keySet()){
            System.out.println(key +"--->"+ map.get(key));
        }
        for(int i=0;i<n;i++){
            if(map.get(arr[i])>0){
                highFreq = arr[i];
                answer = map.get(arr[i]);
            }
        }
        System.out.println(highFreq);
        System.out.println(answer);
        sc.close();
    }
}
