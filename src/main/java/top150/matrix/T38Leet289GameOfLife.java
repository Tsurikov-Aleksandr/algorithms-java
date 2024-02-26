package top150.matrix;

public class T38Leet289GameOfLife {

    public static int nextGen(int cellSum){
       // Any live cell with fewer than two live neighbors dies as if caused by under-population.
       // Any live cell with two or three live neighbors lives on to the next generation.
       // Any live cell with more than three live neighbors dies, as if by over-population.
       // Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
        if(cellSum < 2 || cellSum > 3){
            return -1;
        }
        if(cellSum == 2){
            return 1;
        }
        return 2; // cellSum == 3
    }
    public void gameOfLife(int[][] board) {
        //corners
        board[0][0] += nextGen(board[0][0]);
        board[board.length - 1][0] += nextGen(board[board.length-1][0]);
        board[0][board.length - 1] += nextGen(board[0][board.length-1]);
        board[board.length - 1][board[0].length - 1] += nextGen(board[board.length - 1][board[0].length - 1] );

        //border lines


        //main
        //Each cell interacts with its eight neighbors (horizontal, vertical, diagonal)


        // nexGen <=0  -> 0
        // nexGen >=1  -> 1

    }

}
