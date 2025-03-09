package Ex16Arrays;

import java.util.Arrays;

public class ArrayReverseOrder {
    public static void main(String[] args) {
        int[] marks = {91, 90, 51, 100, 92};
        for(int i=marks.length-1; i>=0; i--)
            System.out.println(marks[i]);//print numbers in reverse order of array only
        Arrays.sort(marks);
        for(int i=marks.length-1; i>=0; i--)
            System.out.println(marks[i]);//print all numbers in descending order
    }

}
