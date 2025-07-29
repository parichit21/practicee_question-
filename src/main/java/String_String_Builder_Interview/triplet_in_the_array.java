package String_String_Builder_Interview;

import java.util.Arrays;

public class triplet_in_the_array {

    public static void main(String[] args) {
//        arr = {12, 3, 4, 1, 6, 9}, sum = 24;  //12, 3, 9
//              1,3,4,6,9,12
        int [] arr ={12, 3, 4, 1, 6, 9};
        triplet(arr,24);
    }

    static boolean triplet(int [] arr, int sum){

               Arrays.sort(arr);
              int low , high;
        for (int i = 0; i <arr.length-2 ; i++) {
                low = i+1;
                high = arr.length-1;
                while(low<high){
                    if(arr[i] +arr[low]+arr[high] == sum){
                        System.out.println(arr[i]+" "+arr[low]+" "+arr[high]);
                   return true;
                    }
                    else if(arr[i] +arr[low]+arr[high] < sum){
                        low++;
                    }else high--;
                }
        }

return false;
    }
}
