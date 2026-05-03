package sumofdigits;
import java.util.Scanner;
public class sum_digits {
    public static int sumDigits(int n){
        int sum = 0;
        while(n>0){
            int digits = n%10;
            sum+=digits;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumDigits(n));
        sc.close();
    }
    
}
