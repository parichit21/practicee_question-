package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Linklist {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in array");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int [] arr = new int[number];
        for(int i =0;i<number;i++)
        {
            arr[i]=scan.nextInt();
        }
      System.out.println(Arrays.toString(arr));
        int num= 4;
       int ans = linearSearch(arr, num);
       System.out.println(ans);
        }

    static int linearSearch(int[] arr, int num){
        if(arr.length == 0){
            return -1;
        }

        for(int i=0;i<arr.length;i++) {
            int element =arr[i];
            if(element == num)
            {
                return i;
            }
        }
       return -1;
    }
}


