package Assignments.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Reverse_integer {
    public static void main(String[] args) {
     int num = 123;
//     output 321
     reverse(num);
    }

    static int  reverse(int num){
        int revn = 0;
        int lastDigit ;
        while (num !=0)
        {
            lastDigit = num%10;
            revn = revn*10+ lastDigit;
            num = num/10;
        }
return revn;
    }
}
