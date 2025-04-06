package Recursion.StringRecursion.LTQuestions;

public class PowerOf2_231 {
    /*231. Power of Two*/
    /*
    Example 1:

    Input: n = 1                               Input: n = 16
    Output: true                               Output: true
    Explanation: 20 = 1                        Explanation: 24 = 16
    */
    public static void main(String[] args) {
//       boolean ans = isPowerOfTwo(3);
       boolean ans = isPowerOfThree(32);
        System.out.println(ans);
       }
    static boolean isPowerOfTwo(int n) {
            return n > 0 && (n & (n - 1)) == 0;

        }

    static boolean isPowerOfThree(int n) {
        if (n <= 0) return false;

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;

    }



}
