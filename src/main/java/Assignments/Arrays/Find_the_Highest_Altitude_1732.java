package Assignments.Arrays;

public class Find_the_Highest_Altitude_1732 {
    /*
    Example 1:

    Input: gain = [-5,1,5,0,-7]
    Output: 1
    Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
             */
    public static void main(String[] args) {
        int [] gain = {-4,-3,-2,-1,4,3,2};
       int ans =  largestAltitude(gain);
       System.out.println(ans);
    }
    static int largestAltitude(int[] gain) {
      int returnsum =0;
        int sum =0;
        for (int i = 0; i < gain.length; i++) {

                sum += gain[i];
                if (sum>returnsum)
                {
                    returnsum = sum ;
                }
        }
        return returnsum;
    }



}
