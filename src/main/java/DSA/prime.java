package DSA;

import java.util.Scanner;
public class prime {

   static boolean primenumber(int number){
        if(number<=1){
            return false;
        }
        int c =2;
        while(c*c <=number){
            if(number%c ==0){
                return false;
            }
            c++;

        }
       return c*c > number;
   }
    public static void main(String[] args) {
System.out.println("enter the number ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        boolean ans =  primenumber(number);
        System.out.println(ans);
   }
}
