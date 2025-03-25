package LTquestions_arrays;

import java.util.Arrays;

/*628. Maximum Product of Three Numbers*/
public class maximum_product_3_no {
    /*Input: nums = [1,2,3]
      Output: 6

      Input: nums = [1,2,3,4]
      Output: 24

      Input: nums = [-1,-2,-3]
      Output: -6
      */
    public static void main(String[] args) {
int [] nums = {-100,-98,-1,2,3,4};
//    bubblesort(nums);
//    System.out.println(Arrays.toString(nums));

//// int ans =   maximumProduct(nums);
// System.out.println(ans);

       int ans =  newmethod(nums);
        System.out.println(ans);
    }
    static int maximumProduct(int[] nums) {
    int result =0;
        int last =nums.length-1;
            result = nums[last]*nums[last-1]*nums[last-2];
            return result;

    }
    static void bubblesort(int [] nums){
        boolean swap;
        for(int i=0;i<nums.length;i++)
        {
            swap = false;
            for(int j=1;j<nums.length-1;j++)
            {

                if(nums[j]<nums[j-1])
                {
                    int temp = nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1] = temp;
                    swap =true;
                }
            }
            if(!swap) {
                break;
            }
        }
    }

    static int newmethod(int [] nums){
        Arrays.sort(nums); // Sort the array
        int n = nums.length;
        // The maximum product is either:
        // 1. The product of the three largest numbers
        // 2. The product of two smallest (possibly negative) and the largest number
        int maxProduct = Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3],
                nums[0] * nums[1] * nums[n - 1]);
        return maxProduct;
    }
}
