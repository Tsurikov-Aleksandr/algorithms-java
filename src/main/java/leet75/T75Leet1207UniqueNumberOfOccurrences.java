package leet75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class T75Leet1207UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();

        for (int y : map.values()) {
            if (set.contains(y)) {
                return false;
            }
            set.add(y);
        }

        return true;
    }
}
