package Ex16Arrays;

public class ArrayMaxMin {
    static int max(int[] numbers)
    {
        int max=numbers[0];
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>max)
                max=numbers[i];
        }
        return max;
    }
    static int min(int[] numbers)
    {
        int min=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min)
                min=numbers[i];
        }return min;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Maximum number is "+max(numbers));
        System.out.println("Minimum number is "+min(numbers));
    }
}
