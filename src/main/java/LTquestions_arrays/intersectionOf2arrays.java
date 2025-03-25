package LTquestions_arrays;

import java.util.Arrays;

/*349. Intersection of Two Arrays*/
public class intersectionOf2arrays {
    /*Input: nums1 = [1,2,2,1], nums2 = [2,2]
      Output: [2]

      Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
      Output: [9,4]
      Explanation: [4,9] is also accepted.
    */
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
    //    intersection(nums1,nums2);
       System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    // Check if already added (to avoid duplicates)
                    boolean alreadyExists = false;
                    for (int k = 0; k < index; k++) {
                        if (temp[k] == nums1[i]) {
                            alreadyExists = true;
                            break;
                        }
                    }
                    if (!alreadyExists) {
                        temp[index++] = nums1[i];
                    }
                    break; // Move to next element in nums1
                }
            }
        }
        // Create exact-sized result array
        return Arrays.copyOf(temp, index);


    }

}
