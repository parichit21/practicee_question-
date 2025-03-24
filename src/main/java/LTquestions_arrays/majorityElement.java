package LTquestions_arrays;

import java.util.Arrays;

/*169. Majority Element*/
public class majorityElement {
    /*Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2*/
    public static void main(String[] args) {
        int[] nums = {3,3,4};
        int ans= majorityElement2(nums);
        System.out.println(ans);
    }
    static int majorityElement(int[] nums) {
int start = 0;
int end = nums.length-1;
        Arrays.sort(nums);
        while(start<end) {
    int mid = start +(end-start)/2;
    if(nums[start] == nums[mid+1])
    {
        return nums[start];

    } else if(nums[start] != nums[mid+1])
    {
        if(nums[start]==nums[mid])
        {
            return nums[start];
        }

            return nums[mid+1];
    }

        }
        return nums[start];
}
            //second method
    static int majorityElement2(int[] nums) {
        int currM=nums[0],n=nums.length,count=1;
        for(int i=1; i<n;i++){
            if(count==0)
                currM = nums[i];
            if(nums[i]==currM)
                count++;
            else
                count--;
        }
        return currM;
    }



}
