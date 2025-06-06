package EX019OopsPart2;

public class ParamModel {
    public static void main(String[] args) {
        Mobile iphone = new Mobile("iphone","2008");
        Mobile oneplus = new Mobile("One Plus", "2015");
        Mobile samsung = new Mobile("Ultra 25 AI", "2025");
        System.out.println(iphone.model_name);
        System.out.println(oneplus.model_name);
        System.out.println(samsung.model_name);
        System.out.println(samsung.year_of_launch);
        System.out.println(iphone.year_of_launch);


        samsung.display();
        String model_name_main = samsung.give_me_model_name();
        System.out.println(model_name_main);
    }
}

class Mobile {
    String model_name;
    String year_of_launch;

    Mobile(String model_name_c, String year_of_launch_c) {
        this.model_name = model_name_c;
        this.year_of_launch = year_of_launch_c;
    }

    void display() {
        System.out.println(this.model_name + " - " + this.year_of_launch);
    }

    String give_me_model_name() {
        return this.model_name;
    }
}

