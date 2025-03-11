package EX18OppsConstructor;

public class Car2 {
    public String model;
    public int year;


    Car2(){
        model= "XXX";
        year  = 1900;
        System.out.println("DC");
    }

    // Param - Constructor
    public Car2(String model_name, int year_created){
        this.model = model_name;
        this.year = year_created;
    }
}
