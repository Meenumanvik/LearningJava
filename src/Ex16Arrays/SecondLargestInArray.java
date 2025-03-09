package Ex16Arrays;

import java.util.Arrays;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] marks = {91, 90, 81, 96, 92};
        Arrays.sort(marks);
        System.out.println(Arrays.toString(marks));
        System.out.println(marks[3]);//second largest by using index number because total length=5 so used index num=3
        System.out.println(marks[marks.length-2]);//Another way to print second largest number
        //without using any function print second largest number
        int secondlargest= marks[0];
        for (int i = 0; i < marks.length ; i++)
        {

            if (marks[i]>secondlargest)
            {
                secondlargest=marks[i];
            }
        }
    }
}
