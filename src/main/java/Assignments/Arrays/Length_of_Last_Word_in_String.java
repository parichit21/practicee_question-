package Assignments.Arrays;


public class Length_of_Last_Word_in_String {

    public static void main(String[] args) {

        String str = "  hello world   ssss";
      str =   str.trim();
String [] ans =   str.split(" ");
        if(ans.length>0)
        {
            String lastword = ans[ans.length-1];
            System.out.println("Length of last word in the string"+"======"+lastword.length());
        }else {
            System.out.println("no word in the string");
        }

    }


}
