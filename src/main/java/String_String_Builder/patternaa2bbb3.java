package String_String_Builder;

public class patternaa2bbb3 {

//    Input: 'aabbcccd' -> Output: 'aa2bb2ccc3d1'

    public static void main(String[] args) {
        pattern("aabbcccd");
    }

    static void pattern(String str){

        char ch = str.charAt(0);
        int count =0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.print(ch);
                count++;

            }else {
                System.out.print(count);
                ch = str.charAt(i);
                count =1;
                System.out.print(ch);
            }
        }  // Print count for the last group
        System.out.print(count);





    }



}
