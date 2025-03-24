package LTquestions_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;



public class Array_Partition {
    public static void main(String[] args) {
        /*Array Partition
        * Input: nums = [1,4,3,2]
          Output: 4
          Explanation: All possible pairings (ignoring the ordering of elements) are:
          1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
          2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
          3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
          So the maximum possible sum is 4.
          * */
        int[] nums={6,2,6,5,1,2};
        int ans = arrayPairSum(nums);
        System.out.println(ans);
    }
    static int arrayPairSum(int[] nums) {
//        arr = 1,2,3,4

                Arrays.sort(nums);
                int last = nums.length-1;
                int sum =0;
                    for(int i=0;i<nums.length;i+=2)
                    {
                        sum += nums[i];
                    }
                return sum;
    }}

