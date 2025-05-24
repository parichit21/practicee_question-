package Assignments.Arrays;

import java.util.Collections;
import java.util.Scanner;

public class Convert_Case_of_Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
       String input =  scanner.nextLine();

       char [] arr = input.toCharArray();
       for(int i =0;i<arr.length;i++)
       {
           if(Character.isLowerCase(arr[i]))
           {
               arr[i] = Character.toUpperCase(arr[i]);
           }else {arr[i] = Character.toLowerCase(arr[i]);}
       }
        String result = new String(arr);
       System.out.println("output "+result);

    }
}
