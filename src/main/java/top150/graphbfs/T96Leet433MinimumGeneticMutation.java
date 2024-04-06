package top150.graphbfs;

import java.util.*;

public class T96Leet433MinimumGeneticMutation {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Deque<String> deque = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();
        List<String> bankList = List.of(bank);
        int level = 0;
        deque.addLast(startGene);
        visited.add(startGene);
        char[] mutationChar = {'A', 'C', 'G', 'T'};
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                String p = deque.pollFirst();
                if (p.equals(endGene)) {
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
                        if (bankList.contains(mutatedString)) {
                            visited.add(mutatedString);
                            deque.addLast(mutatedString);
                        }
                    }
                    arr[x] = prev;

                }
            }
            level++;
        }

        return -1;
    }
}
