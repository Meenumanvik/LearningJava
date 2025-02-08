package Ex03Literals;

public class Concat_Plus {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);
        System.out.println(s1);
        System.out.println(s1.concat("2"));
        System.out.println(s1.concat("2").concat("3"));

        int a = 10;
        int b = 20;
        System.out.println(a + b); // Math

        String name1 = "Meenu";
        String name2 = " Kumari";
        System.out.println(name1+name2); // Concatenation


        // + -> behave differently with the data type.
        // + -> operator overloading
    }
}
