package Ex06TernaryOperator;

public class marks_Grade {
    public static void main(String[] args) {

        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);


        int number = 15;
        String result = (number > 10) ? (number > 20? "G > 20": "B 10 to 20") : "B";
        // (number > 20? "G > 20": "B 10 to 20") -> B 10 to 20

        System.out.println(result);
// Find the maximum number between two numbers.
        // X and Y -> Max X, y -> Ternary Op.
        int x = 10;
        int y  = 20;
        String max = x > y ? "X is max" : "Y is max";
        System.out.println(max);

    }
}
