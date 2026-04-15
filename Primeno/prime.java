package Primeno;

import java.util.Scanner;

public class prime {
    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }

        // Check divisors only up to the square root of n.
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");

        int n = sc.nextInt();

        if(n < 0) {
            System.out.println("Negative numbers are not prime");
            sc.close();
            return;
        }

        if(isPrime(n)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
       
        sc.close();
    }
}
