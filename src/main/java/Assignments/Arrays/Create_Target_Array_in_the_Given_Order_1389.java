package Assignments.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Create_Target_Array_in_the_Given_Order_1389 {
    /*
    Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
    Output: [0,4,1,3,2]
    Explanation:
    nums       index     target
    0            0        [0]
    1            1        [0,1]
    2            2        [0,1,2]
    3            2        [0,1,3,2]
    4            1        [0,4,1,3,2]*/
    public static void main(String[] args) {
                int [] nums={0,1,2,3,4};
                int [] index={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
      ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
         list.add(index[i], nums[i]);
        }
    //    int[] arr = new int[list.size()];
        int[] target = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            target[i] = list.get(i);
        }
        return target;
    }
}
