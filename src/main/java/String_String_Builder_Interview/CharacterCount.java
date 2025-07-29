package String_String_Builder_Interview;

public class CharacterCount {
    public static void main(String[] args) {
     int ans =    character("ababababacdcdcdcd",'c');
    System.out.println(ans);
    }
    static int character(String str, char ch ){
        int count =0;

        char [] arr =str.toCharArray();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == ch) {
                    count++;
            }
        }
        return count;
    }

}
