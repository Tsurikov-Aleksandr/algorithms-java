package top100liked;

import java.util.ArrayList;
import java.util.List;

public class T100likedLeet51NQueens {
    List<List<String>> answer = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        solve(board, n);
        return answer;
    }

    private void solve(boolean[][] board, int n) {
        if (n == 0) {
            boardToString(board);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (isSafe(n - 1, i, board)) {
                board[n - 1][i] = true;
                solve(board, n - 1);
                board[n - 1][i] = false;
            }

        }
    }

    private boolean isSafe(int r, int c, boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][c] || board[r][i]) {
                return false;
            }
        }

        int x = r;
        int y = c;
        while (x < board.length && y < board.length) {
            if (board[x][y]) {
                return false;
            }
            x++;
            y++;
        }

        x = r;
        y = c;
        while (x >= 0 && y >= 0) {
            if (board[x][y]) {
                return false;
            }
            x--;
            y--;
        }

        x = r;
        y = c;
        while (x >= 0 && y < board.length) {
            if (board[x][y]) {
                return false;
            }
            x--;
            y++;
        }

        x = r;
        y = c;
        while (x < board.length && y >= 0) {
            if (board[x][y]) {
                return false;
            }
            x++;
            y--;
        }

        return true;
    }

    private void boardToString(boolean[][] board) {
        List<String> list = new ArrayList<>();

        for (boolean[] row : board) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < board.length; j++) {
                if (row[j]) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }

            list.add(sb.toString());
        }

        answer.add(list);
    }
}
