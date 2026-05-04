package productofdigits;
import java.util.Scanner;
public class prod_digits {
    public static int prodDigi(int n){
        int prod=1;
        while(n>0){
            int digits=n%10;
            prod=prod*digits;
            n = n/10;
        }
        return prod;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(prodDigi(n));
        sc.close();
    }
}
