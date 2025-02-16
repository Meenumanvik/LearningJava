package Ex07IncrementDecrement;

public class IncDecr_Ops {
    public static void main(String[] args) {
        // pre - increment - ++operand.
        // value is incremented first and then stored in the result.
        int a = 10; //( ++a -> a+1)
        int b = ++a; //a -> 11, b -> 11
        System.out.println(b);
        System.out.println(a);
        int result = a++;
        System.out.println(a);
        System.out.println(result);
        System.out.println(b);


        //  Exp and Result Table
        // Line No | a | Result b
        //   8 | 10 | NA
        // 9   | 11 | 11
        // 10   | NA | 11
        // 11   | 11 | NA

        // Line No. | Exp  |  a
        //  11      |   NA   |  10
        //  12      |  result = 10   |  11
        //  13      |  result = 10   |  11

    }
}
