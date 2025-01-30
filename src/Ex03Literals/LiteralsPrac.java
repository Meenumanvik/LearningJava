package Ex03Literals;

public class LiteralsPrac {
    public static void main(String[] args) {
        float pi=3.14f;
        float pi2=3.14F;
        float x= 10.00f;
        boolean is_married=true;
        int marks_eg=-1;
        int Enum=10;
        System.out.println(Enum);// Enum is possible but enum is not possible because small letter enum is keyword
        final int a=10;
        final int age;
        age=19;
        System.out.println(age);
        int age1 = 65; // Decimal System - base wil 10

        // Binary Literal
        int binary_num = 0b1010; // Decimal System - 10

        // Octal base? -> 8
        int octal = 0101;


        // Hexadecimal Literals
        int hex = 0Xface;
        //base 16 color combination are in hex - #28a745
        // Chars - Store
        char c1 = 'A';
        // char c2 = "A"; // String - bunch of char(multiple chars)
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space


        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        //System.out.println("MeenuKumari");
//        System.out.println("Meenu" + new_line + "Kumari");
//        System.out.println("Meenu" + tab_line +  "Kumari");
//        System.out.println("Meenu"+ back_space +  "Kumari");
        System.out.println("Meenu" + carriage_return + "Kumari");

        char c10 = 'A';
        // ASCII, (limited numbers) - A -> 65
        // UNICODE (india, jap, china) - Rupees - ₹
        char ruppes = '₹';
        System.out.println("Meenu has "+ruppes+100);
        char my_laugh_smily = '\u1f60';
        System.out.println(my_laugh_smily);
        char c11  = '\u1F60';

        // Primitive
        byte b = 10;
        int age2 = 65;

        // Non Primitive  (String - bunch of char, multiple chars)
        String name = null; // Size (Bits) -> 64
        // boolean s = null; // Size (Bits) -> NA switch off,switch on
        int age3  = 90; // Size Bits( 32)

    }
}
