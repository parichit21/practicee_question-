package String_String_Builder_Interview;

import java.util.Arrays;

public class StringReverse {

    public static void main(String[] args) {
     //   Reverse("abcdefgh");
     //
        //
        //   ReverseString("abcdefgh");
        stringSwap("abcdefgh");
    }

    /*using StringBulder*/
    static void Reverse(String str){
        StringBuilder builder = new StringBuilder();
        builder.append(str);
        System.out.println( " reversed String is "+ builder.reverse());
    }

    /*using String */
    static  void ReverseString(String str){
        char []  arr= str.toCharArray();
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]);
        }
    }

    //using swap
    static void stringSwap(String str){
        char [] arr = str.toCharArray();
        char temp  ;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
     System.out.println(Arrays.toString(arr));


    }


}
