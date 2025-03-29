package DSA;

public class palindrome {
//    121   or abcdcba
    public static void main(String[] args) {
        String str = "abcsacba";
       boolean result =  ispalindrome(str);
       System.out.println(result);
    }
    static boolean ispalindrome(String str){
        str = str.toLowerCase();
        for(int i =0;i<str.length()/2;i++)
        {
        char start  = str.charAt(i);
        char end = str.charAt(str.length()-1-i);
        if(start != end)
            return false;
        }
        return true;
    }
}
