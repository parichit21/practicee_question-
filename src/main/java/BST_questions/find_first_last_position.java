package BST_questions;


import java.util.Arrays;
//34 find the first and the last position of element in sorted array
/*
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
*/
public class find_first_last_position {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,7,8,8,8,10};
        int target = 8;
      int[] ans  =  searchRange(nums,target);
      System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans= {-1,-1};
     int start = search(nums, target,true);
    int end = search(nums,target,false);

    ans[0] =start;
    ans[1] =end;

        return ans;

    }

    static int search(int[] nums, int target, boolean findsearch)
    {
        int ans =-1;
        int start=0;
        int end = nums.length;

        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(target< nums[mid])
            {
                end = mid-1;

            }else if(target>nums[mid])
            {
                start = mid+1;
            }
            else {
              ans = mid;
              if(findsearch)
              {
                  end = mid-1;
              }else {
                  start = mid+1;
              }
            }
    }
        return ans ; //only for test case
    }



}
