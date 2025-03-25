package LTquestions_arrays;

import java.util.Arrays;

/*268. Missing Number*/
public class missingNumber {
    /*Input: nums = [3,0,1]
      Output: 2

      Input: nums = [0,1]
      Output: 2

      Input: nums = [9,6,4,2,3,5,7,0,1]
      Output: 8
      */
    public static void main(String[] args) {
        int [] nums = {3,0,1};
        bubblesort(nums);
        int ans = missingNumber(nums);
            System.out.println(ans);
    }
    static int missingNumber(int[] nums) {

        int start =0;
        int last = nums.length-1;
        while(start<=last)
        {
            if(nums.length<2 && nums[0]==1)
            {
                return 0;
            }
            if(nums[0] !=0)
            {
                return 0;
            }
            if(nums.length<2 && nums[0]==0)
            {
                return 1;
            }
            if(nums.length == 2)
            {
                if(nums[start]+1 != nums[last])
                {
                    return nums[start]+1;
                }
              return  nums[last]+1;
            }
            if(nums[start] < nums[start+1] && nums[start]+1 == nums[start+1])
            {
                start++;
            }
            if(nums[start] > nums[start+1] && nums[start+1]-1 == nums[start])
            {
                start--;
            }
            else if(nums[start]+1 != nums[start+1])
            {
                return nums[start]+1;
            }
        }
    return 0;
    }

    static void bubblesort(int [] nums){
        boolean swap;

        for(int i=0;i<nums.length;i++)
        {
            swap =false;
            for(int j=1;j<nums.length-i;j++)
            {
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] =nums[j-1];
                    nums[j-1] = temp;
                    swap =true;
                }
            }
            if(!swap) {break;}
        }


    }

}
