package Recursion;

public class SumOfDigit {
    /*12345 =>  1+2+3+4+5=> 15*/
    public static void main(String[] args) {
        int ans = sumofDigit(12345);
        System.out.println(ans);
    }
    static int sumofDigit(int n){
        if(n ==0)
        {
            return 0;
        }
      return (n%10) +sumofDigit(n/10);
    }
}
