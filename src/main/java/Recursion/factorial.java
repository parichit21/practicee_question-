package Recursion;

public class factorial {
    public static void main(String[] args) {
    int ans=    facto(5);
   System.out.println(" ="+ ans);
    }
    /*5! = 5*4*3*2*1*/
    static int facto(int n ){
        if(n<=1)
        {
            return 1;
        }
        System.out.print(n+" *"+" ");
       return n* facto(n-1) ;

    }

}
