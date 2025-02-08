package Ex03Literals;

public class Logical_Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println((a>b) && (c>d));
        System.out.println((a>b) || (c>d));
        System.out.println(!(a>b));

        boolean a1 = true;
        System.out.println(!a1);
        boolean b1 = true;
        System.out.println(!!b1);
        boolean c1= true || false;
        System.out.println(c1);

    }
}
