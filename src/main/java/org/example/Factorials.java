package org.example;

import java.util.Collections;
import java.util.Scanner;

public class Factorials {
//How can you find the factorial of an integer in Java?

    public static void main(String[] args){
//        f(n) = f(1)*f(2)....f(n-1)*f(n)

        System.out.println("enter the number ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
     //   factorial(n);
     //   System.out.println( "factirial is "+factorial(n));
// /////////////////////////////// //    by loop   /////////////////////////////////////////

      //  5
//      1*1*2*3*4*5      =120
  int factorial =1;
for (int i=1;i<=n;i++)
{
    factorial *= i;
}
System.out.println(factorial);


    }

    public static int factorial(int n){
            if(n==1)
        return 1;
            else
           return (n*factorial(n-1));
    }


}
