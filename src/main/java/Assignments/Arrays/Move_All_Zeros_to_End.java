package Assignments.Arrays;

import java.util.Arrays;

public class Move_All_Zeros_to_End {
    public static void main(String[] args) {
        int [] arr = {1,0,2,0,3,0};
      System.out.println( Arrays.toString(moveZero(arr)));
    }

    static int[] moveZero(int [] arr){
        int nonZero =0;
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
           if(arr[i]!=0)
           {
                temp = arr[nonZero];
               arr[nonZero] = arr[i];
               arr[i] = temp;
               nonZero++;
           }
        }
return arr;
    }


}
