package Ex16Arrays;

public class findMissingNumbers {
        public static void MissingNumbers(int[] A) {
            // Create a boolean array to mark present numbers
            boolean[] present = new boolean[101]; // 0 to 100

            // Mark numbers that are present in array A
            for (int num : A) {
                if (num >= 0 && num <= 100) {
                    present[num] = true;
                }
            }

            // Print missing numbers from 1 to 100
            System.out.println("Numbers that don't exist in the array (1 to 100):");
            for (int i = 1; i <= 100; i++) {
                if (!present[i]) {
                    System.out.print(i + " ");
                }
            }
        }

        public static void main(String[] args) {
            int[] A = {1, 2, 7, 6, 4, 20, 0};
            MissingNumbers(A);
        }
    }

