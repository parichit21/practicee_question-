package Assignments.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies_1431 {
    /*
    Input: candies = [2,3,5,1,3], extraCandies = 3
    Output: [true,true,true,false,true]
    Explanation: If you give all extraCandies to:
    - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
    - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
    - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
    - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
    - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
*/
    public static void main(String[] args) {
        int [] candies = {12,1,12};
      System.out.println(kidsWithCandies(candies, 10));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//       List<Boolean> list = new ArrayList<>();
//
//        for(int i =0;i<candies.length;i++)
//        {
//            if(candies[i]+extraCandies >=candies.length)
//            {list.add(true);
//
//            }
//           else list.add(false);
//        }
//        return list;

        List<Boolean> result = new ArrayList<>();
        int max = 0;

        for (int candy : candies) {
            if (candy > max) max = candy;
        }

        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }
}
