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
        while(n>0){
            int digit = n%10;
            sum +=Math.pow(digit,digits);
            n=n/10;
        }
        return sum==original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isAmstrong(n)){
             System.out.println("it is amstrong number");
        }else{
            System.out.print("not amstrng");
        }
        sc.close();
    }
}
