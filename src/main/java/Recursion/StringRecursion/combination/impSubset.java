package Recursion.StringRecursion.combination;

import java.util.ArrayList;
import java.util.List;

public class impSubset {
    /*permutation and combination */
    public static void main(String[] args) {
       String str = "abc";
       /*ans = a,b,c,ab,ac,bc,abc*/
        /*when to apply subset problem
        * this patter of taking some element and removing some in str is called subset pattern  */
       //  subseq("",str);
         int [] arr = {1,3};
     System.out.println(Linearsubseq(arr));
    }

//    by recursion
    /*taking 2 string */
    /*p = pollished and up = unpollished */
    static void subseq(String p ,String up){
            if(up.isEmpty())
            {
                System.out.print("{"+p+"}");
                return;
            }
            char ch =up.charAt(0);
            subseq(p+ch,up.substring(1));
            subseq(p,up.substring(1));
    }

//    by linear
    static List<List<Integer>> Linearsubseq(int[] arr ){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

     for (int num : arr)
     {
         int n = outer.size();
         for (int i = 0; i < n; i++) {
             List<Integer> internal = new ArrayList<>(outer.get(i));
             internal.add(num);
             outer.add(internal);
         }
     }
    return outer;
    }


}
