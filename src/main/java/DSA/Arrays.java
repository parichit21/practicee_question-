package DSA;

import java.util.Scanner;

public class Arrays {
//    syntax  datatype [] = new datatype [size]
//    int [] = new int[size]

    public static void main(String[] args) {
        int [][] arr = new int [3][2];
        Scanner scan = new Scanner(System.in);

        for(int i =0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] =scan.nextInt();
            }
        }

        for(int i =0;i<arr.length;i++)
        {
//            for(int j=0;j<arr[i].length;j++)
//            {
//                 System.out.print(arr[i][j]+" ");
//            }
//            System.out.println(" ");
            System.out.println(java.util.Arrays.toString(arr[i]));
        }

    }
}
