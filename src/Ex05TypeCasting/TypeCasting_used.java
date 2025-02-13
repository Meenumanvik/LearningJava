package Ex05TypeCasting;

public class TypeCasting_used {
    public static void main(String[] args) {
        int course =100;
        float GST = 18.45f;
//        int total_int = course+GST; // Narrowing - Implicit
        int Total = course + (int)GST; // Narrow - Explicit
        System.out.println(Total);
        float total = course + GST; // Widenning - implicit
        System.out.println(total);
        float total1 = course+GST;
        System.out.println(total1);
        float total2 = (float)course+GST; // Widenning - Explicit
        System.out.println(total2);
        int total3 = (int) (course+GST);
        System.out.println(total3);
    }
}
