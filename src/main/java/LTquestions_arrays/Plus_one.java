package LTquestions_arrays;

//66. Plus One

import java.util.Arrays;

//Input: digits = [1,2,3]
/*
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
*/
public class Plus_one {
    public static void main(String[] args) {
        int [] digits = {1,2,3};

    int [] arr =   plusOne(digits);
    System.out.println(Arrays.toString(arr));

    }
    static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // carry over
        }
        // If all were 9, we need a bigger array
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
}}
