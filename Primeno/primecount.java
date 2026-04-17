package Primeno;
import java.util.Scanner;
public class primecount{
  public static boolean isprime(int n){
      if(n<=1){
          return false;
      }
      for(int i = 2;i*i<=n;i++){
          if(n%i==0){
              return false;
          }
      }
      return true;
  }
  public static void primes(int n){
      for (int i = 2; i<=n;i++){
          if(isprime(i)){
              System.out.print(i+" ");
          }
      }
  }
  public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       primes(n);
  }
    
}