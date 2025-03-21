package LTquestions_arrays;
//27. Remove Element
public class Remove_Elements {

//    Input: nums = [0,1,2,2,3,0,4,2], val = 2
//    Output: 5, nums = [0,1,4,0,3,_,_,_]
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};      //ans = 5  [0,1,3,0,4]
        int k =2 ;
      int result =   removeElement(nums, k);
    System.out.println(result);
    }

    static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1]; // Replace with the last element
                n--; // Reduce array size
            } else {
                i++; // Only move forward if no replacement
            }
        }
        return n; // New length of array
    }
}
