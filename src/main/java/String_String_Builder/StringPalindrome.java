package String_String_Builder;

public class StringPalindrome {
    public static void main(String[] args) {
//input abcdcba
       Boolean ans =  palindrome("abcdcba");
System.out.println(ans);
    }

    static Boolean palindrome(String str){
        str = str.toLowerCase();

        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if(start != end){
                return false;
            }
        }
return true;
    }
}
