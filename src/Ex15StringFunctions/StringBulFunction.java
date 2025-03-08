package Ex15StringFunctions;

public class StringBulFunction {
    public static void main(String[] args) {
        String name = "MeenuGupta";
        System.out.println(name.length());
        // 1. charAt()
//        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(10)); // StringIndexOutOfBoundsException

        // 2. concat()
        System.out.println(name.concat(" Kumari"));

        // 3. contains()
        System.out.println(name.contains("me"));

        // 4. equals()
        System.out.println(name.equals("Meenu"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("meenu"));

        // 6. indexOf() //  sonal -> ? o
        System.out.println(name.indexOf('o'));

        String s1 = "meenu";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));


        // 7. length()
        System.out.println(name.length());


        // 8. replace( , )
        System.out.println(name.replace('n', 'N'));

        // 9. split()

        String name4 = "meenumanvik@123gmail.com";
        String[] split = name4.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        //System.out.println(split[2]);


        System.out.println(" ---");

        // 10. substring( , )
        System.out.println(name.substring(1, 3));
        String ss = "hamburgers";
        System.out.println(ss.substring(4,9));


        // 11. toLowerCase()
        System.out.println("ANANYA".toLowerCase());
        System.out.println("ananya".toUpperCase());

        // 12. toUpperCase()
        System.out.println("meenu".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("M"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        // 17. trim()
        String name3 = "    Anaya Gupta     ";
        System.out.println(name3.trim());


        // 18. compareTo()
        System.out.println(name.compareTo("Ananya"));


        // 19. compareToIgnoreCase()
//        System.out.println(name.compareToIgnoreCase("sonal"));


        StringBuilder stringBuilder = new StringBuilder("Meenu");
        stringBuilder.append("Kumari");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi Java");
        sb.append(" It's my World!");
        System.out.println(sb.toString());


    }
}
