package Sorting.bubble.insertionSort;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int [] arr = {-100,-98,
                -1,2,3,4};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int [] arr){
        for(int i =0;i<arr.length-1;i++)
        {
                    for (int j=i+1;j>0;j--)
                    {
                        if(arr[j]<arr[j-1])
                        {
                            swap(arr,j,j-1);
                        }else {break;}
                    }
        }
    }
    static void swap(int [] arr, int first,int second ){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }


}
