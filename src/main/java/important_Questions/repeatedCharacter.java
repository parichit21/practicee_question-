package important_Questions;

import java.util.LinkedList;
import java.util.List;

public class repeatedCharacter {
//    find the non repeated character in the string

    public static void main(String[] args) {
        String str = "aabxbad";
//        output should be xd
List result =    nonRepeatedCharacter(str);


    System.out.println( result.toString());
    }

    static List nonRepeatedCharacter(String str){
        char [] ch = str.toCharArray();
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < ch.length; i++) {
            int count = 0;
            for (int j = 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                  count++;
                }
            }
            if(count ==1)
            {
                list.add(String.valueOf(ch[i]));
            }


        }
        return list;
    }
}
