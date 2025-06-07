package Assignments.Arrays;

import java.util.Arrays;

public class sixDigitnumber_multiply_by_2 {

    /*
    * 6 digit number multi by 2 gives same digit or not
     EX :- 142857  *2 =   285714  */

    public static void main(String[] args) {
        Boolean ans = multiplyByTwo(142857);
        System.out.println(ans);
    }

    static Boolean multiplyByTwo(Integer number){

        int[] original = digitsarray(number);
        int[] multiple = digitsarray(number * 2);

        // Sort both arrays and compare
        Arrays.sort(original);
        Arrays.sort(multiple);

        return Arrays.equals(original, multiple);

    }

    static int[] digitsarray(Integer number){
        int [] arr = new int[6];
        int i =0;
        while (number > 0 && i < arr.length) {
            arr[i] = number % 10;
            number = number / 10;
            i++;
        }
        return arr;
    }
}
