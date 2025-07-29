package String_String_Builder;

public class duplicateWords {
    public static void main(String[] args) {
        String str = "Learn java Learn Selenium api testing";

        /*ans Learn */
        duplicatewords(str);
    }

    static void duplicatewords(String str){
              int count =0;
                str = str.toLowerCase();
             String [] arr  =   str.split(" ");
        for (int i = 0; i < arr.length; i++) {
               count =1;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i].equals(arr[j]))
                {
                    count++;
                }
            }
            if(count>1 && arr[i] !="0")
            {
                System.out.println(arr[i]+"--->" +"count is :- " +count);
            }
        }

    }



}
