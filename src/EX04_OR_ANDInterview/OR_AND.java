package EX04_OR_ANDInterview;

public class OR_AND {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println(a > b || c > d); // false
        System.out.println(a > b || c < d); // true
        System.out.println(a < b || c > d); // true
        System.out.println(a < b || c < d); // true

        System.out.println(a > b && c > d); // false
        System.out.println(a > b && c < d); // false
        System.out.println(a < b && c > d); // false
        System.out.println(a < b && c < d); // true
        int meenu_salary = 600000;
        int abhijeet_salary = 600000;
        boolean salary = meenu_salary > abhijeet_salary || meenu_salary == abhijeet_salary;
        System.out.println(salary);
    }
}
