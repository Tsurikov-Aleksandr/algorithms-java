package top150.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T32Leet30SubstringWithConcatenationOfAllWords {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> answer = new ArrayList<>();
        if (s == null || words == null || words.length == 0) return answer;
        int oneWordLength = words[0].length();

        Map<String, Integer> map = new HashMap<>();
        for (String w : words) {
            map.put(w, map.containsKey(w) ? map.get(w) + 1 : 1);
        }

        for (int i = 0; i <= s.length() - oneWordLength * words.length; i++) {
            Map<String, Integer> copy = new HashMap<>(map);
            for (int j = 0; j < words.length; j++) {
                String str = s.substring(i + j * oneWordLength, i + j * oneWordLength + oneWordLength);
                if (copy.containsKey(str)) {
                    int count = copy.get(str);
                    if (count == 1) {
                        copy.remove(str);
                    } else {
                        copy.put(str, count - 1);
                    }
                    if (copy.isEmpty()) {
                        answer.add(i);
                        break;
                    }
                } else break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s1 = "barfoothefoobarman";
        String[] words1 = {"foo", "bar"}; // [0, 9]

        String s2 = "wordgoodgoodgoodbestword";
        String[] words2 = {"word", "good", "best", "word"}; // []

        String s3 = "barfoofoobarthefoobarman";
        String[] words3 = {"bar", "foo", "the"}; // [6, 9, 12]

        System.out.println(findSubstring(s3, words3));
    }

}
