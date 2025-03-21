package DSA;

import java.util.Scanner;

public class largest {
//    find the largest of the three numbers
    public static void main(String[] args) {
        System.out.println("enter hte three numbers");
        Scanner scan = new Scanner(System.in);
        int a ,b,c;
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();

        int max = a;

        if(max<b)
        {
            max = b ;
        }
        if(max<c)
        {
            max = c ;
        }
        System.out.println(max);

    }
}
