package Recursion.Arrays;

public class findArraysIsSortOrNot {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,0};
       boolean ans =  sortedOrNot(arr, 0);
       System.out.println(ans);
    }
    static boolean sortedOrNot(int [] arr, int index) {
//       base
        if (index == arr.length - 1)
        {
         return true;
        }
           return arr[index]<arr[index+1] && sortedOrNot(arr,index+1);
}}
