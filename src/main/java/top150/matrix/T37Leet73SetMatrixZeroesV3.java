package top150.matrix;

import java.util.Arrays;

public class T37Leet73SetMatrixZeroesV3 {
    public void setZeroes(int[][] matrix) {

        int[] arrI = new int[matrix.length];
        Arrays.fill(arrI, 1);
        int[] arrK = new int[matrix[0].length];
        Arrays.fill(arrK, 1);

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[0].length; k++) {
                if (matrix[i][k] == 0) {
                    arrI[i] = 0;
                    arrK[k] = 0;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (arrI[i] == 0) {
                for (int x = 0; x < matrix[0].length; x++) {
                    matrix[i][x] = 0;
                }
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            if (arrK[i] == 0) {
                for (int x = 0; x < matrix.length; x++) {
                    matrix[x][i] = 0;
                }
            }
        }

    }

}
