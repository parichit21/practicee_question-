package StringBuffer;

public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer sb   = new StringBuffer();
        sb.append("hello");
        sb.append("new ");
        sb.append("world");

        sb.insert(2,"xxx");
        String str = sb.toString();
        System.out.println(str);
    }
}
