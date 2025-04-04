package Recursion.StringRecursion.combination;

public class AsciiValue {
    public static void main(String[] args) {
        String str ="ab";
        subseqAsci("",str);
    }
    /*taking 2 string */
    /*p = pollished and up = unpollished */
    static void subseqAsci(String p,String up ){
        if(up.isEmpty())
        {
            System.out.println(" "+p+" ");
            return;
        }
        char ch= up.charAt(0);
        subseqAsci(p+ch,up.substring(1));
        subseqAsci(p,up.substring(1));
        subseqAsci(p+(ch+0),up.substring(1));
    }
}
