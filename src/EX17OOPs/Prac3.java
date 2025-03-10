package EX17OOPs;

public class Prac3 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = null;
        new Cat();

        c1.running();
        c2.running(); // java.lang.NullPointerException



    }
}


class Cat {
    String name;


    void running() {
        System.out.println("Running");

    }
}
