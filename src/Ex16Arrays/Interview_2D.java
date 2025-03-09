package Ex16Arrays;

public class Interview_2D {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] martix_2_2 = {{1, 2}, {3, 4}};

        int[][] martix_3_1 = {{1}, {3}, {5}};

    }
}
