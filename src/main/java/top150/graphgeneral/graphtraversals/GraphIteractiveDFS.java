package top150.graphgeneral.graphtraversals;

import java.util.*;

public class GraphIteractiveDFS {

    // DFS
    public static void DFS(Map<Integer, List<Integer>> graph, int startV) {

        Deque<Integer> stack = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();
        stack.addLast(startV);

        while (!stack.isEmpty()) {
            int nodeIndex = stack.pollLast();
            if (!visited.contains(nodeIndex)) {
                System.out.println(nodeIndex);
            }
            if (graph.containsKey(nodeIndex)) {
                List<Integer> nodeChildren = graph.get(nodeIndex);
                if (!visited.contains(nodeIndex)) {
                    for (int x : nodeChildren) {
                        stack.addLast(x);
                    }
                    visited.add(nodeIndex);
                }
            }

        }
    }

    // список ребер в список смежности вершин
    public static Map<Integer, List<Integer>> makeGrapf(int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            if (graph.containsKey(edge[0])) {
                graph.get(edge[0]).add(edge[1]);
            } else {
                graph.put(edge[0], new ArrayList<>());
                graph.get(edge[0]).add(edge[1]);
            }
        }
        return graph;
    }

    public static void main(String[] args) {
        int[][] edges = {{1, 2}, {2, 3}, {1, 3}, {3, 4}, {3, 1}};
        Map<Integer, List<Integer>> graph = makeGrapf(edges);
        DFS(graph, 1);
    }
}
