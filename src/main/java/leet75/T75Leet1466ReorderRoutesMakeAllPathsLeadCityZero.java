package leet75;

import java.util.*;

public class T75Leet1466ReorderRoutesMakeAllPathsLeadCityZero {
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (var c : connections) {
            graph.get(c[0]).add(c[1]);
            graph.get(c[1]).add(-c[0]);
        }

        int answer = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(0);
        Set<Integer> set = new HashSet<>();

        while (!deque.isEmpty()) {
            int toCity = deque.pollFirst();
            set.add(Math.abs(toCity));
            for (int x : graph.get(toCity)) {
                if (!set.contains(Math.abs(x))) {
                    deque.addLast(Math.abs(x));
                    if (x > 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

}
