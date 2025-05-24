package Assignments.Arrays;

import java.util.Arrays;

public class Second_Largest_Element {
    public static void main(String[] args) {
        int[] arr = {1,23,4,5,6,7,8,9};
     System.out.println(secondLargest(arr));
    }
    static int secondLargest(int [] arr){
        int max=0;
        int secondmax=0;
        for (int i = 0; i < arr.length; i++) {
                if(arr[i]>max)
                {
                    secondmax = max;
                    max= arr[i];
                } else if (arr[i]>secondmax && arr[i]!= max)
                {
                    secondmax = arr[i];
                }


        }
        return secondmax;
    }
}
