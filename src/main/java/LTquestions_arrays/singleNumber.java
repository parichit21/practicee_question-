package LTquestions_arrays;

import java.util.Arrays;

public class singleNumber {
//    136. Single Number
    /*
    Input: nums = [4,1,2,1,2]
    Output: 4
    */
    public static void main(String[] args) {
        int[] nums ={2,2,1};
//        1,1,2,2,4
        int ans = singleNumber1(nums);
    System.out.println(ans);
    }
    static int singleNumber(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        while (start<end)
        {
//            case 1
            if(nums[start] == nums[start+1])
            {
              start = start + 2;
            }
            else {return nums[start];}
        }
        return nums[start];
    }
//    new method
static {
    for (int i = 0; i < 500; i ++){
        singleNumber1(new int[]{1});
    }
}

    public static int singleNumber1(int[] nums) {


        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }/* Performs a bitwise XOR operation between res and num.
            res = res ^ num
            XOR property:
            x ^ x = 0
            x ^ 0 = x

            This helps find the number that appears only
            once when every other number appears twice. */
        return res;
    }
}
