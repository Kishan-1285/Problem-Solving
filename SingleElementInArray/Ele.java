package SingleElementInArray;

import java.util.Scanner;
class ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i+=2){
            if(arr[i]!=arr[i+1]){
                System.out.println(arr[i]);
                return;
            }
            sc.close();
        }
        System.out.println(arr[n-1]);
    }
}
