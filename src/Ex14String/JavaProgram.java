package Ex14String;

public class JavaProgram {
    public static void main(String[] args) {
        String str = "Java Application";
        for (int i = 0; i < str.length(); i++) {
            //System.out.println(str.charAt(i));

            String str1 = "Java Application";
            str.indexOf('a');
            int index = str.indexOf('a');
            for (int n = 0; n <= index; n++) {
                String sub1 = str1.replace('a', '@');
                System.out.println('@');
                //String sub= str.replace('a','@');
                System.out.println(sub1);
            }
            System.out.println(str1);
        }
        /*for (int j=0; j<str.length();j++)
            if(str.charAt(j)=='a')
                for(int k=0;k<str.length();k++)
                    System.out.println(str.charAt(k));*/
    }
}





