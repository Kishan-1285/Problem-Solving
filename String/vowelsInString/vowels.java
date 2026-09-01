
// Run command: javac vowels.java && java String.vowelsInString.vowels
package String.vowelsInString;

class vowels {
    public static void main(String[] args) {
        String s = "Kishan";
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);

        
    }
}
