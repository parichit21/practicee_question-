package LTquestions_arrays;

import java.util.Arrays;

public class remove_duplicates {

//    26. Remove Duplicates from Sorted Array   -- using slow pointer algo
    public static void main(String[] args) {
//        Input: nums = [1,1,2]
     //   Output: 2, nums = [1,2,_]
        int [] nums = {1,2,1,3,4,6,6,9};
     int k =   removeDuplicates(nums);
     System.out.println(k);
    }
    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
      //  -- using slow pointer algo implimentation
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
    }
//        int[] unique = Arrays.stream(nums).distinct().toArray();

            return i;

        }}

