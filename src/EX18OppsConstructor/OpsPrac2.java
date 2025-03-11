package EX18OppsConstructor;

public class OpsPrac2 {
    public static void main(String[] args) {
        Baby bb = new Baby();

    }
}
    class Baby{
        String name;
        Baby(){
            System.out.println("I am called when object is created");

        }
        // Instance initialization block
        {
            System.out.println("Step 1 - Called Database before working!!");

        }
    }
