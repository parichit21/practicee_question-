package Recursion.StringRecursion.LTQuestions;

public class SumOfAllSubsetXORTotals_1863 {
    /*1863. Sum of All Subset XOR Totals*/
    /*
    Input: nums = [1,3]
    Output: 6,
    Explanation: The 4 subsets of [1,3] are:
    - The empty subset has an XOR total of 0.
    - [1] has an XOR total of 1.
    - [3] has an XOR total of 3.
    - [1,3] has an XOR total of 1 XOR 3 = 2.
    0 + 1 + 3 + 2 = 6
    */
    public static void main(String[] args) {
      int [] arr = {1,2};
       int ans =  subsetXORSum(arr);
       System.out.println(ans);
    }
    static int subsetXORSum(int[] nums) {
      return dfs(nums, 0, 0);
    }

    static int dfs(int[] nums, int index, int currentXor) {
        if (index == nums.length) {
            return currentXor;
        }
        // Include nums[index]
        int include = dfs(nums, index + 1, currentXor ^ nums[index]);
        // Exclude nums[index]
        int exclude = dfs(nums, index + 1, currentXor);
        return include + exclude;
    }

}
