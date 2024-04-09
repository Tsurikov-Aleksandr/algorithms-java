package top150.graphgeneral;

public class T89Leet200NumberOfIslands {
    public int numIslands(char[][] grid) {
        int num = 0;

        if (grid == null) {
            return num;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    num++;
                    sinkLand(grid, i, j);
                }
            }
        }

        return num;
    }

    private void sinkLand(char[][] grid, int i, int j) {
        if (i > grid.length - 1 || i < 0 || j > grid[0].length - 1 || j < 0 || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        sinkLand(grid, i - 1, j);
        sinkLand(grid, i + 1, j);
        sinkLand(grid, i, j - 1);
        sinkLand(grid, i, j + 1);
    }
}
