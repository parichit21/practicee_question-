package LTquestions_arrays;

import java.util.Arrays;

public class countDuplicated {
    /*217. Contains Duplicate
    * Input: nums = [1,2,3,1]
    * Output: true
    *
    * Input: nums = [1,2,3,4]
    * Output: false
    *
    * Input: nums = [1,1,1,3,3,4,3,2,4,2]
    * Output: true*/
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};

       boolean ans =  containsDuplicate(nums);
       System.out.println(ans);
    }
    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {return true;}
        } return false;
    }


}
