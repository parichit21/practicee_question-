package Assignments.Arrays;

import java.util.Arrays;

public class Check_if_the_Sentence_Is_Pangram_1832 {
    /*
    Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
    Output: true
    Explanation: sentence contains at least one of every letter of the English alphabet.*/
    public static void main(String[] args) {
    //  System.out.println(checkIfPangram("leetcode"));
      System.out.println(secondmethod("leetcode"));
    }
    static boolean checkIfPangram(String sentence) {
        int length = sentence.length();
        char[] array = sentence.toCharArray();
        Arrays.sort(array);

        int i = 0;
        while (i < array.length - 1) {
            if (array[i] == array[i + 1]) {
                length--;  // Duplicate character found
            }
            i++;
        }

        return length >= 26;
    }

    static boolean secondmethod(String sentence){
        if(sentence.length() < 26){
            return false;
        }
        for(char i='a';i<='z';i++){
//            checking if all the alphabet are present in the Strign or not
            if(sentence.indexOf(i) < 0){
                return false;
            }
        }
        return true;
    }
}
