package Array_lab;

public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum of the array elements: " + sum);
    }
}
