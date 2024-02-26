package top150.matrix;

import java.util.HashSet;
import java.util.Set;

public class T37Leet73SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        Set<Integer> setI = new HashSet<>();
        Set<Integer> setK = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[0].length; k++) {
                if (matrix[i][k] == 0) {
                    setI.add(i);
                    setK.add(k);
                }
            }
        }

        for (int si : setI) {
            for (int x = 0; x < matrix[0].length; x++) {
                matrix[si][x] = 0;
            }
        }
        for (int sk : setK) {
            for (int y = 0; y < matrix.length; y++) {
                matrix[y][sk] = 0;
            }
        }
    }
}
