package BST_questions;

public class splitArraysLargestSum {
/*
410. Split Array Largest Sum
Input: nums = [7,2,5,10,8], k = 2
Output: 18
*/
    public static void main(String[] args) {
    int [] nums  ={7,2,5,10,8};
    int k = 2;
       int ans =  splitArray(nums,k);
       System.out.println(ans);
    }
    static int splitArray(int[] nums, int k) {

        int start = 0;
        int end =0;
       for(int i =0;i<nums.length;i++)
       {
           start = Math.max(start,nums[i]); //int the end of the loop this will contain the max element in thr array
        end += nums[i];
       }
//   -------------------------------    binary search-------------------------------------------------------------------
        while (start < end){
//try for the mid as potential answer
            int mid = start +(end -start )/2;
//            calc how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums)
            {
                if(sum +num> mid)
                {
                    /*you cannot add this in the subarray, make new one
                    * say you add this num in new subarray, then sum = num*/
                    sum = num;
                    pieces++;
                }
                else {
                    sum += num;
                }
            }
            if(pieces>k)
            {
                start = mid+1;

            }else {
                end = mid;
            }
        }
return end;
    }

}
