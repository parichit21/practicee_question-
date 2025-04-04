package Recursion.StringRecursion.combination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duplicated {
    public static void main(String[] args) {
       int [] arr = {1,2,2};
      List ans =  subsetDuplicate(arr);
      System.out.println(ans);
    }
    static List<List<Integer>> subsetDuplicate(int [] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
//            if current and end element is same
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();

                for (int j = start; j < n; j++) {
                    List<Integer> internal = new ArrayList<>(outer.get(j));
                    internal.add(arr[i]);
                    outer.add(internal);
                }

            }
        return outer;

    }


}
