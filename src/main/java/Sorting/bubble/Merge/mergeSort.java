package Sorting.bubble.Merge;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
       int [] arr = {5,4,3,2,1};
     arr =   mergesortmainFunction(arr);
     System.out.println(Arrays.toString(arr));
    }
    static int [] mergesortmainFunction(int [] arr){
        if(arr.length ==1)
        {return arr;}
        int mid = arr.length/2 ;
        int [] left = mergesortmainFunction(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergesortmainFunction(Arrays.copyOfRange(arr,mid,arr.length));
            return merge(left,right);
    }

    static int[] merge(int [] first,int [] second){
        int [] mix = new int[first.length+ second.length];
        int i=0;
        int j=0;
        int k =0;

        while (i<first.length && j<second.length)
        {
         if(first[i]<second[j])
         {
             mix[k] = first[i];
             i++;
         } else {
             mix[k] = second[j];
             j++;
         }
         k++;
        }
//        it may be possible one array is not complete
//        add all the element
        while (i<first.length)
        {
            mix[k] = first[i];
              i++;
              k++;
        }
        while (j<second.length)
        {
            mix[k] = second[j];
            j++;
            k++;
        }
return mix;

    }

}
