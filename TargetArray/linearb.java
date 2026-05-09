package TargetArray;

import java.util.Scanner;

public class linearb {
     public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        boolean found=false;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Target:");
        int tar=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==tar){
                found = true;
                break;
            }
        }
        if(found==true){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
       sc.close();
    }
}
