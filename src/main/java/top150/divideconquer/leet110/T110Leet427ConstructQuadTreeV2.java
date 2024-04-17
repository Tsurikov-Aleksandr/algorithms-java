package top150.divideconquer.leet110;

public class T110Leet427ConstructQuadTreeV2 {
    public Node construct(int[][] grid) {
        return make(grid, 0, 0, grid.length);
    }

    public Node make(int[][] grid, int i, int j, int n) {
        if (isSame(grid, i, j, n)) {
            return new Node(grid[i][j] == 1, true);
        }

        Node node = new Node(false, false);
        n /= 2;
        node.topLeft = make(grid, i, j, n);
        node.topRight = make(grid, i, j + n, n);
        node.bottomLeft = make(grid, i + n, j, n);
        node.bottomRight = make(grid, i + n, j + n, n);
        return node;
    }

    public boolean isSame(int[][] grid, int x, int y, int n) {
        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (grid[i][j] != grid[x][y]) {
                    return false;
                }
            }
        }
        return true;
    }
}
