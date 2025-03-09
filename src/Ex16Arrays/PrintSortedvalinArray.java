package Ex16Arrays;

import java.util.Arrays;

public class PrintSortedvalinArray {
    public static void main(String[] args) {
                // Example array
                int[] marks = {85, 65, 92, 78, 88, 45};
                // Sort the array
                Arrays.sort(marks);
                // Method 1: Using Arrays.toString()
                System.out.println("Sorted array using Arrays.toString(): ");
                System.out.println(Arrays.toString(marks));

                // Method 2: Using for loop
                System.out.println("\nSorted array using for loop: ");
                for (int i = 0; i < marks.length; i++) {
                    System.out.print(marks[i] + " ");
                }

                // Method 3: Using enhanced for loop
                System.out.println("\n\nSorted array using enhanced for loop: ");
                for (int mark : marks) {
                    System.out.print(mark + " ");
                }
            }
        }


