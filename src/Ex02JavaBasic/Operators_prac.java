package Ex02JavaBasic;

public class Operators_prac {
    public static void main(String[] args) {
        boolean b=true;
        int a=10;
        int c= 20;
        int age=30;
        age/=10;
        System.out.println(age);
        System.out.println(age+a);
        //lOGIC
        long l= 10l; //64 Bits , 8bytes
        char a1='A';
        char b1='B';
        System.out.println(a1+b1); // will not concenate it will happen if and only String condition char comes under intgral
        System.out.println(a1==65); // INTERVIEW question will return true because it is taking Asciivalue
        short s=10;
        System.out.println(a1+s); // will return 65+10=75
        //when you do +conctenate then only ASCII value are used other wise it will print charactor

    }
}
