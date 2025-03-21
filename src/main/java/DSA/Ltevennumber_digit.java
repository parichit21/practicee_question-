package DSA;

public class Ltevennumber_digit {
    public static void main(String[] args) {
        int [] numbs = {12,345,2,6,7896};
      int result =   evennumber(numbs);
    System.out.println(result);
    }
    static int evennumber(int[] numbs){
      int count =0;
        for (int numb : numbs) {
            if (even(numb)) {
                count++;
            }
        }
        return count;
    }

     static boolean even(int numbs) {
      int numberofDigit = digits(numbs);
       if(numberofDigit%2==0)
       {
           return true;
       }
        return false;
    }

    static int digits(int numbs){
int count =0;
        while(numbs>0){
            count++;
            numbs = numbs/10;
        }
        return count;
    }



}
