package LTquestions_arrays;

import java.util.Arrays;

public class Third_max_number {
    /*414. Third Maximum Number*/
    /*
    *
Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
* */
    public static void main(String[] args) {
    int [] nums = {5,2,2};
//   int k=thirdMax(nums);
//   System.out.println(k);

      int k=  newmethod(nums);
   System.out.println(k);
    }
    static int thirdMax(int[] nums) {
//      getting index of max value
        int firstMaxIndex = findMaxIndex(nums);
        int firstMax = nums[firstMaxIndex];

        // Create a new array without the first max
        int[] newArr1 = removeElement(nums, firstMax);
        if (newArr1.length == 0) return firstMax; // If only one distinct

        int secondMaxIndex = findMaxIndex(newArr1);
        int secondMax = newArr1[secondMaxIndex];

        // Create a new array without the second max
        int[] newArr2 = removeElement(newArr1, secondMax);
        if (newArr2.length == 0) return firstMax; // Only two distinct

        int thirdMaxIndex = findMaxIndex(newArr2);
        return newArr2[thirdMaxIndex];
    }
    static int[] removeElement(int[] nums, int val) {
        return Arrays.stream(nums).filter(num -> num != val).toArray();
    }
    static int findMaxIndex(int[] nums) {
        int maxIdx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    static int binarySeratch(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while (end >start)
        {
            int mid = start +(end -start)/2;
            if(nums[mid]>nums[mid+1])
            {
                end = mid;
            }else if(nums[mid]< nums[mid+1])
            {start = mid+1;
            }else
                return mid;
        }
        return start;
    }

/*new method -------------------------------------------------------------------------------------------------*/
    static int newmethod(int[] nums){
        Arrays.sort(nums);  // Sort in ascending order
        int distinctCount = 0, thirdMax = Integer.MIN_VALUE;
        int n = nums.length;

        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1 || nums[i] != nums[i + 1]) {  // Ensure distinct numbers
                distinctCount++;
            }
            if (distinctCount == 3) {  // Third maximum found
                thirdMax = nums[i];
                return thirdMax;
            }
        }

        // If there are fewer than 3 distinct elements, return the maximum
        return nums[n - 1];
    }



}
