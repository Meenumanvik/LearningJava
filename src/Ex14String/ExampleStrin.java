package Ex14String;

public class ExampleStrin {
    public static void main(String[] args) {
        String s1="Kumari";
        s1="Meenu";
        System.out.println(s1);
        System.out.println(s1.concat("Ananya"));
        String s2 = "Hello";
        s2 = s2.concat("World");
        System.out.println(s2);
        String s3 = "HelloGupta";
        String s4 = new String("HelloGupta");
        System.out.println(s3==s4);
        System.out.println(s4);
    }
}
