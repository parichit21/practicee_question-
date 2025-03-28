package LTquestions_arrays;

import java.util.Arrays;

public class LargestNumberAtLeast2cOfOther_747 {
    /*747. Largest Number At Least Twice of Others*/

    /*Input: nums = [3,6,1,0]
      Output: 1
      Explanation: 6 is the largest integer.
      For every other number in the array x, 6 is at least twice as big as x.
      The index of value 6 is 1, so we return 1.

      Input: nums = [1,2,3,4]
      Output: -1
      Explanation: 4 is less than twice the value of 3, so we return -1.*/
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) return 0; // If only one element, return index 0

        int maxIndex = 0;
        int maxVal = nums[0];
        int secondMax = Integer.MIN_VALUE;

        // Find the max element and the second max element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxVal) {
                secondMax = maxVal; // Update second max
                maxVal = nums[i];   // Update max
                maxIndex = i;       // Update max index
            } else if (nums[i] > secondMax) {
                secondMax = nums[i]; // Update second max
            }
        }

        // Check if the max is at least twice as large as the second max
        return (maxVal >= 2 * secondMax) ? maxIndex : -1;
    }
}
