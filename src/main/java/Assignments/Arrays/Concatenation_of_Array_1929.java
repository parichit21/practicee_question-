package Assignments.Arrays;

import java.util.Arrays;

public class Concatenation_of_Array_1929 {
    /*
    Input: nums = [1,2,1]
    Output: [1,2,1,1,2,1]
    Explanation: The array ans is formed as follows:
    - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
    - ans = [1,2,1,1,2,1]*/
    public static void main(String[] args) {
        int [] nums = {1,2,1};
       System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    static int[] getConcatenation(int[] nums) {
           int n = nums.length;
            int [] arr = new  int[2*n];
            for(int i=0;i<n;i++)
            {
                arr[i] = nums[i];
                arr[i+n] =nums[i];
            }
            return arr;

    }
}
