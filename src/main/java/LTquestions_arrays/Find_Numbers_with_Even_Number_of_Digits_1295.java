package LTquestions_arrays;

import java.util.Arrays;

public class Find_Numbers_with_Even_Number_of_Digits_1295 {

    /*Input: nums = [12,345,2,6,7896]
    Output: 2
    Explanation:
    12 contains 2 digits (even number of digits).
    345 contains 3 digits (odd number of digits).
    2 contains 1 digit (odd number of digits).
    6 contains 1 digit (odd number of digits).
    7896 contains 4 digits (even number of digits).
    Therefore only 12 and 7896 contain an even number of digits.

    2.
    Input: nums = [555,901,482,1771]
    Output: 1
    Explanation:
    Only 1771 contains an even number of digits.
     */

    public static void main(String[] args) {
        int []  nums = {12,345,2,6,7896,444444};
        int ans = coutnumber(nums);
        System.out.println(ans);
    }
    static int coutnumber(int [] nums){

        int count = 0;
        for (int num : nums) {
            int digits = 0;
            while (num > 0) {
                num /= 10;
                digits++;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
          }

}
