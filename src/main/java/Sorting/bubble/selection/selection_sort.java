package Sorting.bubble.selection;

public class selection_sort {

    public static void main(String[] args) {
        int [] arr = {9,8,7,6,5,4,3,2,3};
        selectionsort(arr);
    }

    static void selectionsort(int[] arr){

        for(int i=0;i<arr.length;i++)
        {
//            find the max element in the remaining array and swapp with correct index
            int last = arr.length-i-1;
            int max = getMaxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }
    static void swap (int [] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }

     static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i =start; i <=end;i++)
        {
            if(arr[max] < arr[i])
            {
                max =i;
            }

        }
         return max;
    }




}
