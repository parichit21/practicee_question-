package Recursion;

public class palindrome {
    public static void main(String[] args) {
       int number = 1211;
     palindrome(number);
        if(number == sum){
            System.out.println("palindrome");
        }else { System.out.println("not a palindrome");}
    }
    /*121*/
    static int sum =0;
    static void palindrome(int n){
        if (n==0)
        {
            return ;
        }
        int rem = n%10;
        sum = sum*10+rem;
        palindrome(n/10);

    }
}
