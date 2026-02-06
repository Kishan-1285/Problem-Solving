import java.util.Arrays;
public class find_missing_no {
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,6,7,8};
        int[]rev =new int[arr.length];
        int j = 0;
        for (int i =arr.length-1;i >=0;i--) {
            rev[j++] =arr[i];
        }
        System.out.println(Arrays.toString(rev));
    }
}