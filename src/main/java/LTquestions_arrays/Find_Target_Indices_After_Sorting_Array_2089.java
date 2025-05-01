package LTquestions_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Target_Indices_After_Sorting_Array_2089 {

    /*
        Example 1:
        Input: nums = [1,2,5,2,3], target = 2
        Output: [1,2]
        Explanation: After sorting, nums is [1,2,2,3,5].
        The indices where nums[i] == 2 are 1 and 2.
        */



    public static void main(String[] args) {
        int [] nums = {1,2,5,2,3};
      List list =  targetIndices(nums, 2);
      System.out.println(list);
    }
    static List<Integer> targetIndices(int[] nums, int target) {

           List list = new ArrayList();
               Arrays.sort(nums);
               for (int i = 0; i <nums.length ; i++) {
                   if (nums[i] == target) {
                       list.add(i);
                   }
        }
              return list;
    }
}
