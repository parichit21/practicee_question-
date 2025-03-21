package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Search_2D {
    public static void main(String[] args) {
//        search in 2d array
       int[][] arr = new int[3][3];
       System.out.println("enter the elements");
        Scanner scan = new Scanner(System.in);
       for(int i=0;i< arr.length;i++)
       {
           for(int j=0;j<arr[i].length;j++)
       {
           arr[i][j] = scan.nextInt();
       }}
    System.out.println(Arrays.toString(arr));
        System.out.println("number to be searched");
    int number = scan.nextInt();
      int[] answer=   twod(arr,number);
        System.out.println(Arrays.toString(answer));
    }
        static int[] twod(int[][] arr, int number){
            if(arr.length ==0)
                return new int[]{-1};
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[i].length;i++)
                {
                    if(arr[i][j] == number)
                    {
                        return new int[]{i,j};
                    }
                }
            }

        return new int[]{-1};
        }

}
