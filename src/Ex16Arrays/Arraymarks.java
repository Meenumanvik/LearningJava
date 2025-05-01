package Ex16Arrays;

import java.util.Arrays;

public class Arraymarks {
    public static void main(String[] args) {
        int[] marks = {51, 100, 91, 87, 90};
        int[] salary={100,220,90,87};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(salary.length);
        System.out.println("  - - - - - -");

        for (int i = 0; i < marks.length ; i++) { // 0,1,2,3,4
            System.out.println(marks[i]);
            //System.out.println(marks[i] + "");

        }
            Arrays.sort(marks); // 51,87,90,91,100
        System.out.println(Arrays.toString(marks));
        for (int i = 0; i < marks.length ; i++) { // 0,1,2,3,4
                System.out.println(marks[i] + "");

        }


    }
}
