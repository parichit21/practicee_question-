package LTquestions_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*Input: nums = [4,3,2,7,8,2,3,1]
  Output: [5,6]
  Input: nums = [1,1]
  Output: [2]
  */
public class disappeared_inIArray_448 {
    public static void main(String[] args) {
        int [] nums ={4,3,2,7,8,2,3,1};
      List<Integer> ans =   findDisappearedNumbers(nums);
      System.out.println(ans);
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> newList = new ArrayList<>();
        int i=0;
        while(i<nums.length)
        {
            int correct = nums[i]-1;
            if(nums[i] != nums[correct])
            {
                swap(nums,i,correct);
            }else i++;
        }
//        find the list logic
        for (int j =0;j<nums.length;j++)
        {
            if(nums[j] != j+1)
            {
                newList.add(j+1);
            }
        }
        return newList;
    }

    static void swap(int [] arr, int first, int second){
        int temp= arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }


}
