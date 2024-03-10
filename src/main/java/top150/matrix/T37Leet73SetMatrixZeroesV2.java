package top150.matrix;

import java.util.Arrays;

public class T37Leet73SetMatrixZeroesV2 {
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
            for (int k = 0; k < matrix[0].length; k++) {
                if (arrI[i] == 0 || arrK[k] == 0) {
                    matrix[i][k] = 0;
                }
            }
        }


    }
}
