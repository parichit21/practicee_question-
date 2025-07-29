package Assignments.Arrays;

public class newDec {
/*String input="aabbbfgaabbbbrtyrrkkkkkoorrplor";*/  //2-a,3,b-3,f-1,g-1, a-2,b3
// count of the

    public static void main(String[] args) {
        String input="aabbbfgaabbbbrtyrrkkkkkoorrplor";
        numberofCount(input);
    }
    static void numberofCount(String str){

        char currentchar = str.charAt(0);
        int count =1;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i)== currentchar) {
                count++;
            }  else {
                System.out.println(currentchar+" "+ "count"+" "+ count);
                currentchar = str.charAt(i);
                count=1;
            }
        }}
    }




































//    for counting single character
//static void test1(String str, char ch){
//    char [] arr = str.toCharArray();
//    int count =0;
//    for(int i = 0; i < arr.length; i++) {
//        if(arr[i] == ch )
//        {
//            count ++;
//        }
//    }
//}




