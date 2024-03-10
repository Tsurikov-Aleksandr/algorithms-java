package top150.matrix;

import java.util.HashSet;
import java.util.Set;

public class T34Leet36ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (set.contains(board[i][j])) {
                        return false;
                    }
                    set.add(board[i][j]);
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    if (set.contains(board[j][i])) {
                        return false;
                    }
                    set.add(board[j][i]);
                }
            }
        }

        for (int k = 0; k < 9; k += 3) {
            for (int x = 0; x < 9; x += 3) {
                Set<Character> set = new HashSet<>();
                for (int i = k; i < k + 3; i++) {
                    for (int j = x; j < x + 3; j++) {
                        if (board[j][i] != '.') {
                            if (set.contains(board[j][i])) {
                                return false;
                            }
                            set.add(board[j][i]);
                        }
                    }
                }
            }
        }

        return true;
    }
}
