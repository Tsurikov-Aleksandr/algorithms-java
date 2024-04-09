package top150.graphgeneral;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T93Leet207CourseSchedule {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int[] prerequisite : prerequisites) {
            graph.putIfAbsent(prerequisite[0], new ArrayList<>());
            graph.get(prerequisite[0]).add(prerequisite[1]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (graph.containsKey(i)) {
                Map<Integer, Integer> visited = new HashMap<>();
                if (dfs(i, graph, visited)) {
                    return false;
                }
            }
        }

        return true;

    }

    private static boolean dfs(int i, Map<Integer, List<Integer>> graph, Map<Integer, Integer> visited) {
        if (graph.containsKey(i)) {
            visited.putIfAbsent(i, 1);
            List<Integer> listX = graph.get(i);

            for (int y : listX) {

                if (!visited.containsKey(y)) {
                    if (dfs(y, graph, visited)) {
                        return true;
                    }
                } else if (visited.get(y) == 1) {
                    return true;
                }

            }
            visited.put(i, 2);
        }
        return false;
    }


    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}, {0, 1}};
        int[][] prerequisites2 = {{1, 0}};
        System.out.println(canFinish(numCourses, prerequisites));
    }

}
