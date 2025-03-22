package BST_questions;

import java.util.Arrays;

public class search_in_rotated_array {

/*33. Search in Rotated Sorted Array*/

    /*Input: nums = [4,5,6,7,0,1,2], target = 0
      Output: 4
*/
    public static void main(String[] args) {
    int[] nums =  {4,5,6,7,0,1,2};
    int target = 0;
        int ans = search(nums,target);
        System.out.println(ans);
    }
    static int search(int[] nums, int target) {
        int pivot = findpivot(nums);
      /* if you dont find the pivit element then do the binary search*/

        if(pivot ==-1)
        {
//            do the normal binary search
          return  binarysearch(nums,target, 0, nums.length-1);
        }
//        if you find the pivit, you found 2 asc sorted array
        if(nums[pivot] == target)
        {
            return pivot;
        }
        if(target >= nums[0])
        {
            return binarysearch(nums, target,0,pivot-1);
        }

        return binarysearch(nums,target,pivot+1,nums.length-1);
    }
    static int binarysearch(int[] arr, int target, int start, int end){

        while(start <= end)
        {
//            find the middle element
            int mid = start + (end-start) /2;
            if(target <arr[mid]){
                //                ans is in 1st half
                end = mid-1;

            }else if(target>arr[mid])
            {
//                ans is in 2nd half
                start = mid+1;
            }else {
//                ans is in mid
                return mid;
            }

        }
        return -1;
    }
    static int findpivot(int [] nums){

        int start = 0;
        int end = nums.length -1;

        while(start <= end){

            int mid = start + (end-start)/2;
//            4 cases
            if(mid<end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(nums[mid] <= nums[start]){
                end = mid-1;
            }else {
                start = mid +1;
            }

        }
        return -1;
    }
//when we have duplicates
    static int findpivotinrecursion(int [] nums){

        int start = 0;
        int end = nums.length -1;

        while(start <= end){

            int mid = start + (end-start)/2;
//            4 cases
            if(mid<end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
//         if elelents at the middle ,end and start are equal then just skip the duplicates
            if(nums[mid] ==nums[start]&&nums[mid] ==nums[end] )
            {
//                skip the duplicates
//                Note what if these eement at the start and end where the pivot??
//                check if start is pivot
         if(nums[start]> nums[start+1])
         {
             return start;

         }
                start++;
//         chek if end is piviot or not
                if(nums[end]<nums[end-1])
                {end--;
                }
//                left size is sorted pivot is in right
                else if(nums[start]<nums[mid]||(nums[start]==nums[mid] && nums[mid]> nums[end]))
                {
                    start = mid+1;
                }else {end = mid-1;
                }
            }

        }
        return -1;
    }

}
