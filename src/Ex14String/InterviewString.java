package Ex14String;

public class InterviewString {
    public static void main(String[] args) {
        String s = "abc";
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = new String("abc");
        System.out.println(s == s1);
        System.out.println(s == s2);
        System.out.println(s2 == s3);
        System.out.println(s.equals(s1));
        System.out.println(s.equals(s2));
        System.out.println(s2.equals(s3));
        // == ?  Comparsion -> Strings -> This check the locations ref.
//        System.out.println(s1 == s3);
//        System.out.println(s1 == s2);
//        System.out.println(s2 == s3);
//        System.out.println(s1 == s4);
//        System.out.println(s3 == s5);
// // equals ( content) -> value
        // How can I check the values? equals == value
        String name = "meenu";
        name = name.toUpperCase();
        System.out.println(name);
        System.out.println(s3.equalsIgnoreCase(s2)); // T



//  equalsIgnoreCase -> meenu. Meenu, MEENU , MeeNu. MeenU

    }
}
