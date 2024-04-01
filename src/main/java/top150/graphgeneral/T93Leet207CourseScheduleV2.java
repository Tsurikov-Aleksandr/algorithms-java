package top150.graphgeneral;

import java.util.ArrayList;

public class T93Leet207CourseScheduleV2 {

    // кошмар но быстро 2 мс
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph = new ArrayList[numCourses]; // массив аррай листов размером numCourses

        for (int i = 0; i < numCourses; ++i) {
            graph[i] = new ArrayList<>();
        }

        int[] visited = new int[numCourses];

        for (int[] edge : prerequisites) {
            graph[edge[1]].add(edge[0]);

        }

        for (int i = 0; i < numCourses; ++i) {
            if (visited[i] == 0) {
                if (isCycle(graph, i, visited)) return false;
            }
        }
        return true;

    }

    public boolean isCycle(ArrayList<Integer>[] graph, int i, int[] visited) {
        visited[i] = 1;

        for (int v : graph[i]) {
            if (visited[v] == 1) return true;
            if (visited[v] == 0) {
                if (isCycle(graph, v, visited)) return true;
            }
        }

        visited[i] = 2;
        return false;
    }
}
