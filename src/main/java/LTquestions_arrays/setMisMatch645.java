package LTquestions_arrays;

import java.util.Arrays;

public class setMisMatch645 {
    /*Input: nums = [1,2,2,4]
      Output: [2,3]

      Input: nums = [1,1]
      Output: [1,2]
      */
    public static void main(String[] args) {
        int [] nums = {3,2,2};
        int[] ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
    }
   static int[] findErrorNums(int[] nums) {
        int i=0;
        while(i < nums.length)
        {
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct])
            {
                swap(nums,i,correct);
            }else i++;
        }

        for(int j=0;j<nums.length;j++)
        {
            if(nums[j] != j+1)
            {
               return new int[]{nums[j],j+1};
            }
        }
        return new int []{-1,-1};
    }
    static  void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] =nums[second];
        nums[second]=temp;
    }
}
