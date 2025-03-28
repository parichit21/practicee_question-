package LTquestions_arrays;

import java.util.Arrays;

public class firstMissingPositive_41 {
    /*41. First Missing Positive*/
    /*Input: nums = [1,2,0]
      Output: 3
      Explanation: The numbers in the range [1,2] are all in the array.

      Input: nums = [3,4,-1,1]
      Output: 2
      Explanation: 1 is in the array but 2 is missing.

      Input: nums = [7,8,9,11,12 ]
      Output: 1
      Explanation: The smallest positive integer 1 is missing.
      */
    public static void main(String[] args) {

        int [] nums = {3,4,-1,1 };
       int ans = firstMissingPositive(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(ans);
    }
    static int firstMissingPositive(int[] nums) {
    int i =0;
    while (i<nums.length)
    {
      int  correct = nums[i]-1;
      if( nums[i]> 0 && nums[i]<= nums.length && nums[i] != nums[correct])
      {
          swap(nums,i,correct);
      }
      else i++;
    }
    int smallest;
//    logic for finding
        for(int k=0;k<nums.length;k++)
        {
    if(nums[k] != k+1)
    {
        return k+1;
    }
        }
        return nums.length+1;
    }
    static void swap (int [] arr, int first, int second)
    {
        int temp =arr[first];
        arr[first] =arr[second];
        arr[second] = temp;
    }
}
