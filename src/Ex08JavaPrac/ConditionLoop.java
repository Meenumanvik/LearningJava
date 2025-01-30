package Ex08JavaPrac;

public class ConditionLoop {
    public static void main(String[] args) {
        //int age=25;
        int age = Integer.parseInt(args[0]);
        if(age>18) {
            System.out.println("Allowed to Vote");
        }
        else {
            System.out.println("Not Allowed");
        }

    }
}
