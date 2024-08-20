package top100liked;

import java.util.*;

public class T100likedLeet438FindAllAnagramsInString {
    public static List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) {
            return Collections.emptyList();
        }

        List<Integer> answer = new ArrayList<>();
        Map<Character, Integer> mapP = new HashMap<>();
        Map<Character, Integer> mapS = new HashMap<>();

        for (char x : p.toCharArray()) {
            mapP.put(x, mapP.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < p.length(); i++) {
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
        }

        if (mapP.equals(mapS)) {
            answer.add(0);
        }

        int start = 0;
        int end = p.length();

        while (end < s.length()) {
            mapS.put(s.charAt(start), mapS.getOrDefault(s.charAt(start), 1) - 1);
            if(mapS.get(s.charAt(start)) == 0){
                mapS.remove(s.charAt(start));
            }
            mapS.put(s.charAt(end), mapS.getOrDefault(s.charAt(end), 0) + 1);
            if (mapP.equals(mapS)) {
                answer.add(start + 1);
            }
            start++;
            end++;
        }

        return answer;
    }

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";
        //[0,6]
        List<Integer> answer = findAnagrams(s,p);
        answer.forEach(System.out::print);
    }
}
