package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class smae_number_count {

    public static void main(String[] args) {
// number = 1385757879
int n = 1385757879;
int count = 0;

while(n>0)
{
    int rem = n%10;
    if(rem == 7)
    {
        count ++;
    }
    n=n/10;
}
System.out.println(count);


    }
}
