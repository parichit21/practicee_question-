package org.example;

import java.util.Scanner;

//How do you remove spaces from a string in Java?
public class whitespace {
    public static void main (String[] args){

        String str;
        System.out.println("enter the String ");
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
//        char[] arr = str.toCharArray();
        String result ="";
        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i) != ' '){
                result += str.charAt(i);
            }
            }
        System.out.println("String is "+ result);
    }
}
