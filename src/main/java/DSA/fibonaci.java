package DSA;

import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {
//        0,1,1,2,3,5,8,13
        int a=0;
        int b=1;
        int num,c;

        System.out.println("enter the number for the fibonacci");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        System.out.print(a+" ,"+b);
        for (int i =1;i<=num;i++)
        {
            c = a+b;
            a=b;
            b=c;
            System.out.print(" ,"+c);
        }

    }
}
