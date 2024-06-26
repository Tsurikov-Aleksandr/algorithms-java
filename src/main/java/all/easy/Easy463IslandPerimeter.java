package all.easy;

public class Easy463IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        if (grid == null) return 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return countEdges(grid, i, j);
                }
            }
        }
        return 0;
    }

    public int countEdges(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return 1;
        }
        if (grid[i][j] == 0) {
            return 1;
        }
        if (grid[i][j] == 2) {
            return 0;
        }

        int count = 0;
        grid[i][j] = 2;

        count += countEdges(grid, i - 1, j);
        count += countEdges(grid, i, j - 1);
        count += countEdges(grid, i, j + 1);
        count += countEdges(grid, i + 1, j);

        return count;

    }
}
