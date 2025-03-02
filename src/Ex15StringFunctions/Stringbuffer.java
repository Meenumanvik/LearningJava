package Ex15StringFunctions;
import java.lang.StringBuffer;

public class Stringbuffer {
    public static void main(String[] args) {
        String s = "Hello";
        s.concat("World");
        System.out.println(s);
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        System.out.println(sb);
    }
}
