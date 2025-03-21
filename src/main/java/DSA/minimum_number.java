package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class minimum_number {
    public static void main(String[] args) {
//        find the min element in the array
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number total ");
        int number = scan.nextInt();

        int [] arr =new int[number];
        System.out.println("enter the elements ");
        for(int i =0;i<number;i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int answer = minimum(arr);
        System.out.println(answer);
    }
    static int minimum(int[] arr){
        int number =arr[0];
            if(arr.length ==0)
            {return -1;
            }
          for(int i=0;i<arr.length;i++)
          {
              if(arr[i]< number)
              {
                  number = arr[i];

              }
          }
        return number;
    }


}
