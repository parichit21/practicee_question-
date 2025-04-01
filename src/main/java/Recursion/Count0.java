package Recursion;

public class Count0 {
    /*1203201205030-----> ans => 5*/
    public static void main(String[] args) {
         int ans=    count(101010101);
            System.out.println(ans);
    }
    static int count = 0;
    static int count(int n){
        return healper(n,0);
    }
    private static int healper(int n , int c){
    if(n==0)
    {return c;
    }
    int rem = n%10;
        if(rem ==0)
        {
            return healper(n/10,c+1);
        }
        return healper(n/10,c);
    }
}
