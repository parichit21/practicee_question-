package org.example;

import java.util.Scanner;

public class palindrome {
//     How do you check whether a string is a palindrome in Java?
    public static void main(String[] args){

        String a;
        System.out.println("enter the String");
        Scanner scan = new Scanner(System.in);
        a = scan.next();
//        convert String to array
        char [] ch;
        char [] rev;
        ch = a.toCharArray();
        rev = a.toCharArray();
        int length = ch.length;
        boolean isPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            if (ch[i] != ch[length - 1 - i]) { // Compare first with last, second with second last, etc.
                isPalindrome = false;
                break; // No need to check further
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
