package LTquestions_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_of_Two_Arrays_II_350 {

    /*
    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2,2]
    */
    public static void main(String[] args) {
int [] nums1 = {1,2,2,1};
        int [] nums2 = {2,2};
      int [] ans = intersect(nums1,nums2);
      System.out.println(Arrays.toString(ans));
    }

    static int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        // Convert List to array
        int[] res = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            res[k] = result.get(k);
        }
        return res;


    }
}
