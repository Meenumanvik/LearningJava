package Ex14String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        String str = "i,i,love,india";
        String[] s = str.split(",");
        Map<String, Integer> map = new HashMap<>();

        for (String st : s) {
            Integer old = map.get(st);
            if (old == null) {
                old = 0;
                map.put(st, old + 1);
            }

                System.out.println(map);

            }

    }
}
