package leet75;

import java.util.HashMap;
import java.util.Map;

public class T75Leet2352EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        int answer = 0;

        Map<String, Integer> map = new HashMap<>();

        for (int[] x : grid) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < grid.length; i++) {
                sb.append(x[i]);
                sb.append("+");
            }
            String s = sb.toString();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (int j = 0; j < grid.length; j++) {
            StringBuilder sb = new StringBuilder();
            for (int[] y : grid) {
                sb.append(y[j]);
                sb.append("+");
            }
            String s = sb.toString();
            if (map.containsKey(s)) {
                answer += map.get(s);
            }
        }

        return answer;
    }
}
