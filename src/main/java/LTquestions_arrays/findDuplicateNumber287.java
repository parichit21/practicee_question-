package LTquestions_arrays;

//287. Find the Duplicate Number
public class findDuplicateNumber287 {
   /*Input: nums = [1,3,4,2,2]
     Output: 2

     Input: nums = [3,1,3,4,2]
     Output: 3

    Input: nums = [3,3,3,3,3]
    Output: 3
     */
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};
       int k = findDuplicate(nums);
        System.out.println(k);
    }
    static int findDuplicate(int[] nums) {
            int i =0;
            while (i<nums.length)
            {
                int correct = nums[i]-1;
                if(nums[i] != nums[correct])
                {
                    swap(nums, i,correct);
                }else i++;
            }
//            find the number
        for(int j=0;j<nums.length-1;j++)
        {
            if(nums[j] != j+1)
            {
               return nums[j];
            }
        }
        return nums[nums.length-1];
    }

    static void swap (int []nums, int first,int second)
    {
        int temp = nums[first];
            nums[first] = nums[second];
            nums[second]= temp;
    }
}
