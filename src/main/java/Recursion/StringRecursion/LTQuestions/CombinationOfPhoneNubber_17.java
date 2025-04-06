package Recursion.StringRecursion.LTQuestions;

import java.util.ArrayList;
import java.util.List;

public class CombinationOfPhoneNubber_17 {
    /*
      Input: digits = "23"
      Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
      */
    public static void main(String[] args) {
        pad("", "21");
       // letterCombinations("",);

    }
    static List<String> letterCombinations(String digits) {
        return padHelper("", digits);
    }

    private static List<String> padHelper(String p, String up) {


        if (up.isEmpty()) {
            List<String> result = new ArrayList<>();
            result.add(p);
            return result;
        }

        int digit = up.charAt(0) - '0'; // convert '2' to 2
        List<String> result = new ArrayList<>();
        for (int i =(digit-1)*3; i<digit*3;i++) {
            char ch = (char) ('a' + i);
            result.addAll(padHelper(p + ch, up.substring(1)));
        }

        return result;
    }



    static void pad(String p ,String up){
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0'; // this will convert '2' into 2

        for(int i =(digit-1)*3; i<digit*3;i++)
        {
            char ch = (char)('a' +i);
            pad(p+ch,up.substring(1));
        }

    }

}
