package org.example;

public class Swap_number_without_Third_Variables {
public static void main(String[] args){



    // a=2 , b=3
    //b = a+b  b=2+3 ==5
//    a= b-a   a = 5-2 ==3
//    b =b-a  b= 5-3 =2

    int a = 5;
    int b=3;
    System.out.println("original value of a and b is  = "+a +", " +b);

    b = a + b;
    System.out.println("changed value of b is "+ b);
    a = b-a;
    System.out.println("swap value a is "+ a);
    b = b-a;
    System.out.println("swap value b is "+ b);



}






}
