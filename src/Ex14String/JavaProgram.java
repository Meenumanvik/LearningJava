package Ex14String;
import java.util.*;

public class JavaProgram {
    public static void main(String[] args) {
        String input = "Java Application";
        String transformed = transformString(input);
        System.out.println(transformed);
    }

    public static String transformString(String input) {
        StringBuilder result = new StringBuilder();
        int atCount = 1;
        for (char c : input.toCharArray()) {
            if (c == 'a' ) {
                for (int i = 0; i < atCount; i++) {
                    result.append('@');
                }
                atCount++;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
     /*   StringBuilder str1=new StringBuilder();
        for (int i = 0; i<str.length(); i++) {
            if (str.charAt(i) == 'a') {
                for(int j=1;j<i;j++){
                str1.replace(1,j,"@");}
            }else {
                str1.append(str.charAt(i));
            }}

            System.out.println(str1);

*/
            /*str.indexOf('a');
            int index = str.indexOf('a');
            for (int n = 0; n <= index; n++) {
                String sub1 = str1.replace('a', '@');
                System.out.println('@');
                //String sub= str.replace('a','@');
                System.out.println(sub1);
            }
            System.out.println(str1);*/



        /*for (int j=0; j<str.length();j++)
            if(str.charAt(j)=='a')
                for(int k=0;k<str.length();k++)
                    System.out.println(str.charAt(k));*/







