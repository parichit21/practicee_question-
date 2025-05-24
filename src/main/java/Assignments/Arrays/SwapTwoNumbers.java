package Assignments.Arrays;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a =2 ;
        int b = 3;
        swap(a,b);
    }

    static void swap (int a ,int b){
        int c ;
                c=a;
        a=b;
        b=c;
        System.out.println("a-->" +a);
        System.out.println("b-->" +b);

    }
}
