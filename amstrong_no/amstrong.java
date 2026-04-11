package amstrong_no;
import java.util.Scanner;
public class amstrong {
    public static int countDigits(int n){
        int count = 0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static boolean isAmstrong(int n){
        int original = n;
        int digits = countDigits(n);
        int sum = 0;

        // Add each digit raised to the total number of digits.
        while(n>0){
            int digit = n%10;
            sum +=Math.pow(digit,digits);
            n=n/10;
        }

        // Armstrong number: sum of powered digits equals the original number.
        return sum==original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(isAmstrong(n)){
             System.out.println("It is an Armstrong number");
        }else{
            System.out.print("Not an Armstrong number");
        }
        sc.close();
    }
}
