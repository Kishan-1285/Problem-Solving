import java.util.Arrays;
class palindrome {
    public static void main(String[] args) {
      int arr[] ={1,2,3,2,1};
      int rev[] =new int[arr.length];
      int j=0;
      for(int i=arr.length-1;i>=0;i--){
          rev[j]=arr[i];
          j++;
      }
      if(Arrays.equals(arr, rev)){
          System.out.println("the given Array is palindrome");
      }else{
          System.out.println("the given array is not a palindrome");
      }
      System.out.println(Arrays.toString(arr));
      System.out.println(Arrays.toString(rev));
      
   }
}