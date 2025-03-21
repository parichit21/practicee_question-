//Write a Java program to check if a vowel is present in a string.

package org.example;

public class check_if_a_vowel_is_present_in_a_string {
    public static void main(String[] args) {
// a,e,i,o,u



String name  = "hello";
        char [] word= name.toCharArray();

        for(int i = 0; i < word.length; i++)
        {
            if (word[i] == 'a' || word[i] == 'e' || word[i] == 'i' ||
                    word[i] == 'o' || word[i] == 'u')
            {
System.out.println("True");

            }
        }

    }
}
