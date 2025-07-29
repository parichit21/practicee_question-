package String_String_Builder;

import java.util.Arrays;

public class secondMax {

    public static void main(String[] args) {

    }

    static void second(int [] arr){
        int max =0;
        int secmax=0;
        for (int i = 0; i <arr.length ; i++) {
                if(arr[i]> max)
                {
                    secmax= max;
                    max = arr[i];

                }else if(arr[i]>secmax && arr[i] !=max)
            {
                secmax = arr[i];
            }
        }


    }
}
