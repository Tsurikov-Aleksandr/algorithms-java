package leet75;

import java.util.ArrayDeque;
import java.util.Deque;

public class T75Leet994RottingOranges {
    public int orangesRotting(int[][] grid) {
        Deque<int[]> deque = new ArrayDeque<>();
        int fresh = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    deque.addLast(new int[]{i, j});
                }
                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) {
            return 0;
        }

        if (deque.isEmpty()) {
            return -1;
        }

        int minutes = -1;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};

        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int z = 0; z < size; z++) {
                int[] cell = deque.pollFirst();
                int x = cell[0];
                int y = cell[1];
                for (int[] dir : dirs) {
                    int i = x + dir[0];
                    int j = y + dir[1];
                    if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1) {
                        grid[i][j] = 2;
                        fresh--;
                        deque.addLast(new int[]{i, j});
                    }
                }
            }
            minutes++;
        }

        if (fresh == 0) {
            return minutes;
        }

        return -1;
    }

}
