package Recursion.StringRecursion.combination;

public class removeAlphabetInStr {
    public static void main(String[] args) {
            String str = "bacapplecad";
    //    remove("",str);
     System.out.println(skipapple(str));
    }
    /*taking 2 string */
    /*p = pollished and up = unpollished */
    static void remove(String p , String up ){
        if(up.isEmpty())
        {
            System.out.println(p);
        return;
        }
            char ch =up.charAt(0);
        if(ch == 'a')
        {
            remove(p,up.substring(1));
        }
        else {
            remove(p+ch,up.substring(1));
        }
    }
//making it in the same string
    static String skip(String up ){
        if(up.isEmpty())
        {
            return "";
        }
        char ch =up.charAt(0);
        if(ch == 'a')
        {
          return   skip(up.substring(1));
        }
        else {
         return   ch + skip(up.substring(1));
        }
    }

    static String skipapple(String up){
        if(up.isEmpty())
        {
            return "";
        }
        if(up.startsWith("apple"))
        {
            return skipapple(up.substring(5));
        }
        else {return up.charAt(0)+skipapple(up.substring(1));}
    }

}
