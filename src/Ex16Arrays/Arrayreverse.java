package Ex16Arrays;

public class Arrayreverse {
    public static void main(String[] args) {
        int[] marks = {91, 90, 51, 100, 92};
        int[] marks_rev = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            marks_rev[i] = marks[marks.length - 1 - i];
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks_rev[i]);
        }
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
