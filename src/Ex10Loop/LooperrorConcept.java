package Ex10Loop;

public class LooperrorConcept {
    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            System.out.println(i);


            // exit code 130 (Stop by Yourself- Kill) Red Button - interrupted by signal
            // exit code 0 - Successful

            for (int shruti = 0; shruti < 18; shruti++) {
                if (shruti > 15) {
                    System.out.println("Gift from Papa, Iphone");
                } else {
                    System.out.println("No Gift!!");
                }
            }

        }
    }
}
