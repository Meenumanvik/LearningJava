package Ex16Arrays;

public class IDArrays {
    public static void main(String[] args) {
        int a[] = new int[-1]; //java.lang.NegativeArraySizeException

        int[] a2 = new int[5];

        int[] a4 = new int[3];

        a4[0] = -90;
        a4[1] = -91;
        a4[2] = -91;
    }
}
