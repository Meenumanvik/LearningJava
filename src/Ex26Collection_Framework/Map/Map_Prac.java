package Ex26Collection_Framework.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Prac {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        // Map is key - value
        m1.put("name", "Meenu");
        m1.put("age", 23);
        m1.put("Roll",1);
        System.out.println(m1);

        Map m2=new LinkedHashMap();
        m2.put("name", "Meenu");
        m2.put("age", 23);
        m2.put("Roll",1);
        System.out.println(m2);

        Map m3=new TreeMap();
        m3.put("name", "Meenu");
        m3.put("age", 23);
        m3.put("Roll", 1);
        System.out.println(m3);
        System.out.println(m3.get("age"));


    }
}
