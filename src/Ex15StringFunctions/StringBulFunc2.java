package Ex15StringFunctions;

public class StringBulFunc2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        // Creates a new string "Hello World!"
        System.out.println(s3);
        System.out.println(s1.concat(s2));

        StringBuilder stringBuilder = new StringBuilder("Meenu");
        stringBuilder.append("Kumari");
        System.out.println(stringBuilder);
        String input="MeenuKumari";
        System.out.println(stringBuilder.reverse());
        int count =1;
        for(char ch :input.toCharArray()){
            if(ch=='e'){
                for(int j=0;j<count;j++){
            stringBuilder.append('@');}
                count++;}
                else{
                    stringBuilder.append(ch);}
            }
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());


        // StringBuffer , StringBuilder - 2 more ways to create strings.
    }

}
