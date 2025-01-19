package Ex02JavaBasic;

public class Threemax {
    public static void main(String[] args) {
        int num=23, num1=34, num2=-11;
       int largest = (num>=num1)?((num>num2)?num:num2):((num1>=num2))?num1:num2;
        //int max=(num>num1)? num :num1;
        //int max1=(max>num2)? max:num2;
        //System.out.println(max1);
        System.out.println("Largest number" +largest);
    }
}
