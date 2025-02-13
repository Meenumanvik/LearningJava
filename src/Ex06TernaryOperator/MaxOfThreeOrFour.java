package Ex06TernaryOperator;

public class MaxOfThreeOrFour {
    public static void main(String[] args) {
        int n1 = 2, n2 = 9, n3 = -11;

        //  100,34,10 ->  100

        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3) ;
        System.out.println("Largest Number: " + largest);


    }
}
