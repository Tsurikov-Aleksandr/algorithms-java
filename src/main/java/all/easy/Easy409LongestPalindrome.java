package all.easy;

import java.util.HashMap;
import java.util.Map;

public class Easy409LongestPalindrome {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int answer = 0;
        int mid = 0;

        for (int i : map.values()) {
            if (i % 2 == 0) {
                answer += i;
            } else {
                answer += i - 1;
                mid = 1;
            }
        }
        return answer + mid;
    }
}
