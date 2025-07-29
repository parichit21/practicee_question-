package String_String_Builder;

import java.util.ArrayList;
import java.util.List;

public class shift_All_Zero {
/*What is the Java program to shift all zeros to the end of an array?*/

    /* Example: For input [0, 1, 0, 3, 12], output will be [1, 3, 12, 0, 0].*/
    public static void main(String[] args) {
       int [] arr = {0, 1, 0, 3, 12};
     //   shiftelement(arr);
        secordway(arr);
    }
    static void shiftelement(int[] arr){
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                list1.add(arr[i]);
            }
            else list2.add(arr[i]);
        }
//        System.out.println(list1);
        list2.addAll(list1);
        System.out.println(list2);

    }

    static void secordway(int[] arr){
        int index = 0;
            for (int i = 0; i <arr.length ; i++) {
                if (arr[i]!= 0){
                    arr[index] = arr[i];
                    index++;
                }
        }
        for (int i = index; i <arr.length ; i++) {
            arr[i] =0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
