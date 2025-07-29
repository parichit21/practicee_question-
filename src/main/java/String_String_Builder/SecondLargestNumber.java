package String_String_Builder;


import java.util.Arrays;

public class SecondLargestNumber {

    public static void main(String[] args) {
int [] arr = {1,2,3,6,4,5,9,8,0};
      // System.out.println(secondLargest(arr));
       System.out.println(withoutSort(arr));
       /*[0, 1, 2, 3, 4, 5, 6, 8, 9]*/
    }

   static int  secondLargest(int [] arr){
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
       return arr[arr.length-2];
   }

   static int withoutSort(int [] arr){
        int max=0 ;
        int secondmax =0;
       for (int i = 0; i < arr.length-1; i++) {
                if(arr[i]> max)
                {
                    secondmax = max;
                    max = arr[i];
                }else if (arr[i] > secondmax && arr[i] != max) {
                    secondmax = arr[i];
                }
       }

       return secondmax;
   }



}
