package org.example;

//Write a Java program to print a Fibonacci sequence using recursion.

import java.util.Scanner;

public class Fibonacci_Sequence
{
    public static void main(String[] args) {

//   0 1 1 2 4 8 16
//        f(n) = f(n-1)+f(n-2)

int n ;
System.out.println("Enter the number for febo ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        febo(n);
        for (int i=0;i<n;i++)
        {
            System.out.print(febo(i)+" ,");
        }
//       ------------------------------------------- normal method
//        int a =0;
//        int b =1;
//        int c = 1;
//
//        for(int i =1;i<=n;i++)
//        {
//            System.out.print(a +", ");
//            a=b;
//            b=c;
//            c=a+b;
//        }
//------------------------------------------------------------recursion
    }
    public static  int febo(int n)
    {
        if(n<=1)
        {
            return n;

        }else
        {
          return (febo(n-1)+febo(n-2));
        }
    }
}
