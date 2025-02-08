package Ex03Literals;

public class BODMAS {
    public static void main(String[] args) {
        System.out.println((9 * 3 / 9 + 1) * 3);
        System.out.println((27 / 9 + 1) * 3);

        // 9 * 3 - 27
        // 27/9 -> 3
        // 3+1 -> 4
        // 4 * 3 -> 12

        // == ?  Compare the values
        System.out.println( 10 == 10);
        System.out.println( 10 < 10);
        System.out.println( 10 == 20);
        System.out.println( 10 <= 10);
        // 10 < 10 or 10 = 10
        System.out.println( 10 >= 10); //  10> 10 or 10 = 10

    }
}
