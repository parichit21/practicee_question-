package BST_questions;

public class rotationCount {

    public static void main(String[] args) {
        int[] nums =  {4,5,6,7,0,1,2};

        System.out.println(countRotations(nums));
    }
    static int countRotations(int[] nums )
    {
        int pivot = findPivit(nums);
     return pivot+1;

    }

//for non duplicate in array
     static int findPivit(int[] nums) {
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
//for the duplicate elelemts in array
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
//                Note what if these element at the start and end where the pivot??
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
