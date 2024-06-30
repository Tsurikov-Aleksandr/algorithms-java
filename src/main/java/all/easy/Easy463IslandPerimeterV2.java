package all.easy;

public class Easy463IslandPerimeterV2 {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int perimeter = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    // Up
                    if (i == 0 || grid[i - 1][j] == 0) {
                        perimeter++;
                    }
                    // Down
                    if (i == row - 1 || grid[i + 1][j] == 0) {
                        perimeter++;
                    }
                    // Left
                    if (j == 0 || grid[i][j - 1] == 0) {
                        perimeter++;
                    }
                    // Right
                    if (j == col - 1 || grid[i][j + 1] == 0) {
                        perimeter++;
                    }
                }
            }
        }

        return perimeter;
    }
}
