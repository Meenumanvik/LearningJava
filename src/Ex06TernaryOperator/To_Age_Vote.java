package Ex06TernaryOperator;

public class To_Age_Vote {
    public static void main(String[] args) {
        // result = condition ? expression1 : expression2;
        int age = 10;
        String canIVote =  age >= 18 ? "Yes, You can vote" : "No, You can't Vote";
        System.out.println(canIVote);

        // result = condition ? expression1 : expression2;
        int number = -5;
        String result  = number > 0 ? "Positive" : "Negative";
        System.out.println(result);

    }
}
