package Hashmap;

import java.util.HashMap;

public class Roman_to_Integer_13 {

    /*
    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
    */


    /*
    Input: s = "III"
    Output: 3
    Explanation: III = 3.
    */
    public static void main(String[] args) {
            String s= "MCMXCIV";
      System.out.println( romanToInt(s));
    }

    static int romanToInt(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();
            hs.put('I',1);
        hs.put('V',5);
        hs.put('X',10);
        hs.put('L',50);
        hs.put('C',100);
        hs.put('D',500);
        hs.put('M',1000);


                int ans =0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = hs.get(s.charAt(i));
            int nextVal = (i + 1 < s.length()) ? hs.get(s.charAt(i + 1)) : 0;

            if (currentVal < nextVal) {
                // Subtract if smaller numeral comes before a larger one
                ans -= currentVal;
            } else {
                ans += currentVal;
            }
        }
      return ans;
    }
}
