package leet75;

import java.util.ArrayDeque;
import java.util.Deque;

public class T75Leet1926NearestExitFromEntranceInMaze {
    public int nearestExit(char[][] maze, int[] entrance) {
        Deque<int[]> deque = new ArrayDeque<>();
        deque.addLast(entrance);
        maze[entrance[0]][entrance[1]] = '+';

        int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        int steps = 0;

        while (!deque.isEmpty()) {
            steps++;

            int n = deque.size();
            for (int i = 0; i < n; i++) {
                int[] current = deque.pollFirst();

                for (int[] direction : directions) {
                    int x = current[0] + direction[0];
                    int y = current[1] + direction[1];

                    if (x < 0 || x >= maze.length || y < 0 || y >= maze[0].length) {
                        continue;
                    }
                    if (maze[x][y] == '+') {
                        continue;
                    }

                    if (x == 0 || x == maze.length - 1 || y == 0 || y == maze[0].length - 1) {
                        return steps;
                    }

                    maze[x][y] = '+';
                    deque.addLast(new int[]{x, y});
                }
            }
        }

        return -1;
    }


}
