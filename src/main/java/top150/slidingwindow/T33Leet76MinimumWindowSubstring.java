package top150.slidingwindow;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class T33Leet76MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        if (t.isEmpty()) {
            return "";
        }
        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (char w : t.toCharArray()) {
            countT.put(w, countT.containsKey(w) ? countT.get(w) + 1 : 1);
        }

        int resStart = 0;
        int resEnd = 0;
        int have = 0;
        int need = countT.size();
        int resLength = Integer.MAX_VALUE;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            window.put(c, window.containsKey(c) ? window.get(c) + 1 : 1);

            if (countT.containsKey(c) && Objects.equals(countT.get(c), window.get(c))) {
                have++;
            }

            while (have == need) {
                if (r - l + 1 < resLength) {
                    resStart = l;
                    resEnd = r;
                    resLength = r - l + 1;
                }
                window.put(s.charAt(l), window.get(s.charAt(l)) - 1);
                if (countT.containsKey(s.charAt(l)) && window.get(s.charAt(l)) < countT.get(s.charAt(l))) {
                    have--;
                }
                l++;
            }
        }
        if (resLength == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(resStart, resEnd + 1);

    }

    public static void main(String[] args) {
        String s1 = "ADOBECODEBANC";
        String t1 = "ABC"; // "BANC"

        String s2 = "a";
        String t2 = "a"; // "a"

        String s3 = "a";
        String t3 = "aa"; // ""

        String s4 = "aa";
        String t4 = "aa"; // "aa"

        System.out.println(minWindow(s4, t4));
    }
}
