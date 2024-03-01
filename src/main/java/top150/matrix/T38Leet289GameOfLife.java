package top150.matrix;

public class T38Leet289GameOfLife {
    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        int[][] tempBoard = new int[rows][cols];

        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                int liveNeighbors = neighbor(board, x - 1, y - 1) + neighbor(board, x - 1, y)
                        + neighbor(board, x - 1, y + 1) + neighbor(board, x, y + 1) +
                        neighbor(board, x + 1, y + 1) + neighbor(board, x + 1, y)
                        + neighbor(board, x + 1, y - 1) + neighbor(board, x, y - 1);

                if (board[x][y] == 1) {
                    tempBoard[x][y] = (liveNeighbors < 2 || liveNeighbors > 3) ? 0 : 1;
                } else {
                    tempBoard[x][y] = (liveNeighbors == 3) ? 1 : 0;
                }
            }
        }

        for (int x = 0; x < rows; x++) {
            board[x] = tempBoard[x].clone();
        }


    }

    public int neighbor(int[][] board, int x, int y) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] == 0) {
            return 0;
        }
        return 1;
    }

}
