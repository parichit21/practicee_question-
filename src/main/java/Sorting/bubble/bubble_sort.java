package Sorting.bubble;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int [] arr ={4,3,6,7,9,1,2};
        Bubble(arr);
       System.out.println(Arrays.toString(arr));

    }
    static void Bubble(int[] arr){
        boolean swapped;
//        run the steps for n-1 times
        for (int i=0;i<arr.length;i++)
        {
            swapped =false;
//            for each step, max item will come at the last respective index
            for(int j=1;j<arr.length-i;j++)
            {
//                 swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1])
                {
//                    swap
                    int temp =arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }

//of you did not swap for the for a perticular value of i , it means the array is sorted hence stop the program
        if(!swapped)
        { break;}
        }
    }
}
