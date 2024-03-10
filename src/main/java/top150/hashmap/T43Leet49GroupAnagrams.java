package top150.hashmap;

import java.util.*;

public class T43Leet49GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] wordCharsArray = word.toCharArray();
            Arrays.sort(wordCharsArray);
            String sortedWord = new String(wordCharsArray);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
