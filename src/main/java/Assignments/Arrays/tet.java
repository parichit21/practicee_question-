package Assignments.Arrays;


/*[4:31 PM] Jaskaran Singh Gill
Find the Nearest prime Number to a given number.
 */
/*22 return ans => 23 */
public class tet {

    public static void main(String[] args) {
        primeNumber(23);
String str ="programing ";
char ch ='g';
   //   int ans =   StringCount(str,ch);
     //   System.out.println(ans);
    }
//    1,2,3,4,5,6,7
    static void primeNumber(int num){
        for (int i = 3; i < num; i++) {
            boolean isPrime = true;
            for(int j=2 ;j<i;j++)
            {
               if(i%j == 0 )
               {
                   isPrime = false;
                   break; // No need to check further if one divisor is found
               }
            }
            if (isPrime) {
                System.out.println("Prime number " + i);
            }
        }
    }
    //Write a Java program to count how many times a specific character appears in a string.

    static int StringCount(String str, char ch ){
        char [] arr = str.toCharArray();
        int count= 0;
        for (int i = 0; i < arr.length; i++) {
                if(arr[i] == ch)
                {
                    count++;
                }

        }


        return count;
    }

    static void prime(int num){
        int lower = num-1;
        int higher = num+1;

//        for lower prime
        while(lower>=2)
        {
            boolean isPrime = true;
            for (int i = 2; i < lower; i++) {
                if(lower%i ==0)
                {
                    isPrime=false;
                    break;
                }}
            if(isPrime) break;
            lower--;
        }

//        for higher
        while (true){
            boolean isPrime = true;
            for (int i = 0; i < higher; i++) {
                if(higher%i ==0)
                {
                    isPrime =false;
                    break;
                }
            }
            if(isPrime) break;
            higher++;
        }
        System.out.println("Nearest lower prime to " + num + " is: " + lower);
        System.out.println("Nearest higher prime to " + num + " is: " + higher);



    }






}
