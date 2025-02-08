package Ex03Literals;

public class Operators {
    public static void main(String[] args) {
        // Assignment operator
        int age = 90;
        // int -> data type
        // age -> identifier
        // 90 -> Literal
        // = -> ? operator
        // RHV to the LH
        // Arithmetic Operators
        //        + (Addition)
//                - (Subtraction)
//                * (Multiplication)
//                / (Division)
//                % (Modulo) | Modulus - Remainder

        int a = 20;
        int b = 3;
        float c = 3f;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b); // 6
        System.out.println(a/c); // 6.6666665
        // Unary Operator
        int d = +10;
        int a1 = -110;
        System.out.println(d);
        System.out.println(a1);

        int e = -1;
        e = e+1;
        System.out.println(e);

    }
}
