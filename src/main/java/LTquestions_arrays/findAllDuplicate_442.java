package LTquestions_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAllDuplicate_442 {
    /*Input: nums = [4,3,2,7,8,2,3,1]
      Output: [2,3]

      Input: nums     = [1,1,2]
      Output: [1]

      Input: nums = [1]
      Output: []
    */
    public static void main(String[] args) {
        int [] nums ={1};
      List<Integer> ans =   findDuplicates(nums);
            System.out.println(ans);
    }

    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> newList = new ArrayList<>();
        int i=0;
        while(i<nums.length)
        {
            int correct = nums[i]-1;
            if(nums[i]!= nums[correct])
            {
                swap(nums,i,correct);
            }else i++;
        }
        //            find the number
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j] != j+1)
            {
                newList.add(nums[j]);
            }
        }
        return newList;
    }
  static void swap(int[] nums, int first, int second){
        int temp = nums[first];
      nums[first] = nums[second];
      nums[second] = temp;
    }
}
