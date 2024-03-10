package top150.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class T31Leet3LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int answer = 0;
        Set<Character> ch = new HashSet<>();
        int start = 0;
        int end = 0;
        while (end < s.length()) {
            if (ch.contains(s.charAt(end))) {
                answer = Math.max(answer, end - start);
                while (ch.contains(s.charAt(end))) {
                    ch.remove(s.charAt(start));
                    start++;
                }
            } else {
                ch.add(s.charAt(end));
                end++;
            }
        }
        answer = Math.max(answer, end - start);
        return answer;
    }

    public static void main(String[] args) {
        String t1 = "abcabcbb"; // 3
        String t2 = "bbbbb"; // 1
        String t3 = "pwwkew"; // 3
        String t4 = "aab"; // 2
        String t5 = "dvdf"; // 3
        System.out.println(lengthOfLongestSubstring(t4));

    }
}
