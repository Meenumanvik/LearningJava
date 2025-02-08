package Ex03Literals;

public class Interview_Questions {
    public static void main(String[] args) {
        System.out.println(!(10>20));
        //System.out.println((30>90)!);
        System.out.println(!!!!(30>90));

        String first_name = "Meenu";
        String last_name = "Kumari";
        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        // PramodDutta1010 - first operator - + performed as Concatenation

        System.out.println(a + b + first_name + last_name);
        // First + math -> 20PramodDutta



        System.out.println(first_name + last_name + (a + b));



    }
}
