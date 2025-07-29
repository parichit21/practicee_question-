package String_String_Builder;

import java.util.HashSet;
import java.util.Set;

public class palindrome_substrings {
    public static void main(String[] args) {
      /*  Set<String> palindromes = palindromeSubstring("ababa");
        System.out.println("Palindrome substrings are: " + palindromes);*/




    }
            /* babad */
/*   static  Set<String> palindromeSubstring(String str){

       Set<String> result = new HashSet<>();
       for (int i = 0; i < str.length(); i++) {
                expandAroundCenter(str,i,i,result);
           expandAroundCenter(str,i,i+1,result);
       }
       return result;
   }*/

   static String longestPalindrome(String str){
       if (str == null|| str.isEmpty()) {
           return "";
       }
         int start =0, end =0;
       for (int i = 0; i < str.length(); i++) {
           int lenght1 = expandAroundCenter(str,i,i);
           int length2 = expandAroundCenter(str,i,i+1);
           int actuallength  = Math.max(lenght1,length2);
           if (actuallength> end-start){
               start = i-(actuallength-1)/2;
                end = i+actuallength/2;
           }

       }

        return str.substring(start,end+1);
   }



     static int expandAroundCenter(String str, int left, int right) {
                while (left>=0 && right<str.length()&& str.charAt(left)==str.charAt(right)){
                    left--;
                    right++;
                }
         return right-left;
     }
}
