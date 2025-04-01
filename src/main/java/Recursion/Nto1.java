package Recursion;

public class Nto1 {
    public static void main(String[] args) {
        funboth(5);
    }
    static void fun(int n ){
//condition for the function to quit
        if(n==1)
        {
            System.out.print(1);
            return;
        }
        System.out.print(n);
        fun(n-1);
    }

    static void funrev(int n ){
//condition for the function to quit
        if(n==0)
        {

            return;
        }
        System.out.print(n);
        funrev(n-1);

    }

    static void funboth(int n ){
//condition for the function to quit
        if(n==0)
        {

            return;
        }
        System.out.print(n);
        funboth(n-1);
        System.out.print(n);
    }
}
