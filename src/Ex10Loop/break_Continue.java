package Ex10Loop;

public class break_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if( i == 5){
                break;
                //continue; // skip below code, move to top
            }
            System.out.println(i);

        }
    }
}
