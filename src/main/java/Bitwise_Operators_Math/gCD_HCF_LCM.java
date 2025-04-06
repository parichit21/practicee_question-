package Bitwise_Operators_Math;

public class gCD_HCF_LCM {

//    HCF formulla --> gcd(rem(b,a),a)
    public static void main(String[] args) {
   System.out.println(gcd(2,16));
      //  System.out.println(LCM(2,16));
    }
    static int gcd(int a ,int b){
        if (a == 0) {
            return b;
        }
        return gcd((b%a),a);
    }

//    LCM(a, b)  -->  (a*b)/HCF(a,b)

    static int LCM(int a,int b){
            return a*b/gcd(a,b);
    }
}
