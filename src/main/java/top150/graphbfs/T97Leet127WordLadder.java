package top150.graphbfs;

import java.util.*;

public class T97Leet127WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //Time Limit Exceeded
        Deque<String> deque = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();
        int level = 1;
        deque.addLast(beginWord);
        visited.add(beginWord);
        char[] mutationChar = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                String p = deque.pollFirst();
                if (p.equals(endWord)) {
                    return level;
                }
                char[] arr = p.toCharArray();
                for (int x = 0; x < arr.length; x++) {
                    char prev = arr[x];
                    for (char m : mutationChar) {
                        if (prev == m) {
                            continue;
                        }
                        arr[x] = m;
                        String mutatedString = String.valueOf(arr);
                        if (visited.contains(mutatedString)) {
                            continue;
                        }
                        if (wordList.contains(mutatedString)) {
                            visited.add(mutatedString);
                            deque.addLast(mutatedString);
                        }
                    }
                    arr[x] = prev;

                }
            }
            level++;
        }
        return 0;
    }
}
