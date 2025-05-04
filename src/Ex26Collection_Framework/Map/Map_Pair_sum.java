package Ex26Collection_Framework.Map;

import java.util.HashMap;

public class Map_Pair_sum {
    public static void main(String[] args) {
    int[] inpStr = {4, -5, 9, 11, 25, 13, 12, 8, 5, 15, 6, 7};
    findPairs(inpStr, 20);
}

public static void findPairs(int[] nums, int target) {
    HashMap<Integer, Boolean> map = new HashMap<>();

    for (int num : nums) {
        int complement = target - num;
        if (map.containsKey(complement)) {
            System.out.println("Pair found: (" + num + ", " + complement + ")");
        }
        map.put(num, true);
    }
}
}
