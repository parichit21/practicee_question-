package org.example;

import java.util.Scanner;

//Write Java program that checks if two arrays contain the same elements.
public class same_array {

    public static void main(String [] args){
        int arr[] = new int[5];
        int brr[] = new int[5];
        System.out.println("Enter the elements in arr");
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the elements in brr");
        for(int i=0;i<5;i++)
        {
            brr[i] = scan.nextInt();
        }

        for(int i =0;i<5;i++)
        {
            for(int j = 0;j<5;j++)
            {
                if(arr[i] ==brr[j] )
                {
                    System.out.println(arr[i]);
                }
                else{
                    System.out.println("not a same array");
                }
            }
        }









    }

}
