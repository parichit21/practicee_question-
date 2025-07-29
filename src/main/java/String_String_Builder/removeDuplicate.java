package String_String_Builder;

public class removeDuplicate {

    public static void main(String[] args) {
        removdup("Learn java Learn Selenium api testing");
    }
    
    static void removdup(String str){
            
      str =    str.toLowerCase();
        String  [] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            boolean isduplicate  = false;
            for(int j = 0; j < i; j++) {
                   if (arr[i].equals(arr[j]))
                   {
                       isduplicate = true;
                       break;
                   }
            }
            if(!isduplicate){
                System.out.println(arr[i]);
            }

            
        }
        
    }
}
