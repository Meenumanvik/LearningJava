package Ex10Loop;

public class Loopdiv3andDiv5 {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++)
        {
            if(i%3==0 && i%5==0)
                System.out.println("Divisible by 3 and 5 -> "+i);
            else if(i%3==0)
                System.out.println("Divisible by 3 -> "+i);
            else if(i%5==0)
                System.out.println("Divisible by 5 -> "+i);
        }
    }
}
