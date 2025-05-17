package EX019OopsPart2.Poly.MethodOverloading;

public class LabOverloading {
    public static void main(String args[])
    {
        MathOperations m1= new MathOperations();
        int r= m1.add(3,14);
        System.out.println(r);

        int r1= m1.add(15,56,89);
        System.out.println(r1);

        double r2=m1.add(3.34,4.56);
        System.out.println(r2);

    }
}
