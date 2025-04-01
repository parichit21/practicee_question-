package Recursion;

public class productOfDigit {
    /*12345 =>  1*2*3*4*5=> 120*/
    public static void main(String[] args) {
        int ans = productOfDigit(12345);
            System.out.println(ans);
    }
    static int productOfDigit(int n ){
        if(n==1)
        {
            return 1;
        }

     return (n%10) * productOfDigit(n/10);
    }
}
