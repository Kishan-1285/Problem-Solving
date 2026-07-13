package two_pointer.array_palindrome;
class Main {
    public static void main(String[] args) {
        int []arr = {1,2,3,2,1};
        int left = 0;
        int right = arr.length-1;
        boolean isPalindrome = true;
        
        while(left<right){
            if(arr[left] == arr[right]){
                left++;
                right--;
            }else{
                isPalindrome = false;
                break;
            }
        }
       if(isPalindrome){
           System.out.println("it is palindrome");
       }else{
           System.out.println("it is not a palindrome");
       }
    }
}