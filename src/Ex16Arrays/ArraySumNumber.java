package Ex16Arrays;

public class ArraySumNumber {
    public static void main(String[] args) {
        int marks[]={67,78,80,81,90,79};
        int Total=0;
        for (int i=0;i<marks.length;i++)
        {
            Total=Total+marks[i];
        }
        System.out.println(Total);
        //Second Method to add all array numbers using for each loop
        for(int n : marks)
        {
            Total=Total+n;
            System.out.println(Total);
        }
    }
}
