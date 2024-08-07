package leet75;

import java.util.HashSet;
import java.util.Set;

public class T75Leet1456MaximumNumberOfVowelsInSubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        int tempCount = 0;
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        for (int i = 0; i < k; i++) {
            if (set.contains(s.charAt(i))) {
                tempCount++;
            }
        }

        int answer = tempCount;

        int start = 0;
        int end = k;

        while (end < s.length()) {
            if (set.contains(s.charAt(start))) {
                tempCount--;
            }
            if (set.contains(s.charAt(end))) {
                tempCount++;
            }
            start++;
            end++;
            answer = Math.max(answer, tempCount);
        }

        return answer;
    }
}
