package Recursion.patterns;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,6,2,1};
        swap(arr,5,0);
        System.out.println(Arrays.toString(arr));
    }
            static void swap(int [] arr ,int r,int c){
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            if(arr[c]>arr[c+1])
            {
                int temp =arr[c];
                arr[c] =arr[c+1];
                arr[c+1] =temp;
            }
            swap(arr,r,c+1);
        }else {swap(arr,r-1,0);}
            }
}
