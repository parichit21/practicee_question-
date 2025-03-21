package org.example;

import java.util.Scanner;
import java.util.Stack;

// Write a Java program to check if the given number is a prime number.
public class prime_number {
 public static void main (String[] args){

     int number;
     System.out.println("Write a number");
    Scanner scan = new Scanner(System.in);
    number = scan.nextInt();
//    6
//     3

    for(int i =2 ;i<number/2 ;i++)
    {
        if (number/2 ==0)
        {
            System.out.println("prime number ");
        }
    }







 }
}
