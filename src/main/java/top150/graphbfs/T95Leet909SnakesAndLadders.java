package top150.graphbfs;

import java.util.ArrayDeque;
import java.util.Deque;

public class T95Leet909SnakesAndLadders {
    public int snakesAndLadders(int[][] board) {
        int length = board.length;
        int moves = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        boolean[][] visited = new boolean[length][length];
        deque.addLast(1);
        visited[length - 1][0] = true;
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                int currBoardVal = deque.pollFirst();
                if (currBoardVal == length * length)
                    return moves;
                for (int diceVal = 1; diceVal <= 6; diceVal++) {
                    if (currBoardVal + diceVal > length * length)
                        break;
                    int[] pos = findCoordinates(currBoardVal + diceVal, length);
                    int row = pos[0];
                    int col = pos[1];
                    if (!visited[row][col]) {
                        visited[row][col] = true;
                        if (board[row][col] == -1) {
                            deque.add(currBoardVal + diceVal);
                        } else {
                            deque.add(board[row][col]);
                        }
                    }
                }
            }
            moves++;
        }
        return -1;
    }

    public int[] findCoordinates(int curr, int length) {
        int row = length - (curr - 1) / length - 1;
        int col = (curr - 1) % length;
        if (row % 2 == length % 2) {
            return new int[]{row, length - 1 - col};
        } else {
            return new int[]{row, col};
        }
    }
}
