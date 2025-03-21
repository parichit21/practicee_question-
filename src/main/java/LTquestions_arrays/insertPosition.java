package LTquestions_arrays;
//35. Search Insert Position
public class insertPosition {
    public static void main(String[] args) {
//        Input: nums = [1,3,5,6], target = 5   Output: 2 position [1,3,5,5,6]
//nums = [1,3,5,6]
        int [] nums = {1,3,5,6};
        int target = 2;
    int number =     searchInsert(nums, target);
    System.out.println(number);
    }

    static int searchInsert(int[] nums, int target) {

        if(nums.length == 0)
        {return 0;}
        for(int j=1;j<nums.length;j++)
        {
           if(nums[j] >= target)
           {
            return j;
           }
            }

        return nums.length;
    }
}
