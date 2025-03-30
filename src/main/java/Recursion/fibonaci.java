package Recursion;

public class fibonaci {
    /*linear recursion */
    public static void main(String[] args) {
        int num = 6;
       // int ans = fibo(num);

       for(int i =0;i<num;i++)
       { //fiboFormula(i);
           System.out.println(fiboFormula(i));
       }



    }

  static int fiboFormula(int n )
  {
   return (int) (Math.pow(((1+Math.sqrt(5))/2),n) /Math.sqrt(5));
  }

    static int fibo(int n){

//        base condition
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
