package Bitwise_Operators_Math;

public class primeNumber {
    /*find all the prime in the range of n */
    public static void main(String[] args) {
        int n=40 ;
        boolean [] prime = new boolean[n+1];
        sieve( n ,prime);
    }
    static void sieve(int n , boolean[] prime){
        for (int i = 2; i <=n ; i++) {
            if(!prime[i]){
                for(int j=i*2;j<=n;j+=i)
                {
                    prime[j]=true;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if(!prime[i])
            {
                System.out.print(i+" ");
            }
        }
    }
}
