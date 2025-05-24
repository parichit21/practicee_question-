package Assignments.Arrays;

public class Print_Even_Words_from_String {
    public static void main(String[] args) {
        String word = "hello test String String words length x tt aaa";
        StringManipulation(word);
    }

    static void StringManipulation(String word){
       word =  word.trim();
          String [] ans =   word.split(" ");
        for (int i = 0; i <ans.length ; i++) {
            if(ans[i].length()%2 ==0)
            {
                System.out.println(ans[i]);
            }
        }
    }
}

