package Ex02JavaBasic;

public class Increment_DecrementOperator {
    public static void main(String[] args) {
/*String age_s = agrs[0];
int age = Integer.parseInt(age_s);
        System.out.println(age);*/
int age=36;
String result= (age<18)? "Minor":(age<65)? "Adult" : "Senior";
        System.out.println(result);
    }
}
