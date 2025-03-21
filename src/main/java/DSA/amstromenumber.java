package DSA;

import java.util.Scanner;

public class amstromenumber {

//    153 = 1^3 + 5^3 + 3^3  =153

    public static void main(String[] args) {
   //     System.out.println("enter the number ");
        Scanner scan = new Scanner(System.in);
     //   int number = scan.nextInt();
     //  boolean ans =  amstrom(number);
     //   System.out.println(ans);

        for(int i=100;i<1000;i++)
        {
            if(amstrom(i))
            {
                System.out.print(i+" ");
            }
        }
    }
   static boolean amstrom(int number) {
        int temp;
        int original = number;
int sum=0;

       while(number>0)
       {
           temp = number%10;
           sum = sum + temp*temp*temp;
           number = number/10;
       }
       return sum == original;


   }

}
