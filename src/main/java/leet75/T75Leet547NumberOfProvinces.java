package leet75;

public class T75Leet547NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int provinces = 0;
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[i].length; j++) {
                if (isConnected[i][j] == 1) {
                    provinces++;
                    changeToZero(i, j, isConnected);
                }
            }
        }

        return provinces;
    }

    private void changeToZero(int x, int y, int[][] matrix) {
        if (matrix[x][y] == 0) {
            return;
        }

        matrix[x][y] = 0;
        matrix[y][x] = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[x][i] == 1) {
                changeToZero(x, i, matrix);
            }
            if (matrix[i][y] == 1) {
                changeToZero(i, y, matrix);
            }
            if (matrix[y][i] == 1) {
                changeToZero(y, i, matrix);
            }
            if (matrix[i][x] == 1) {
                changeToZero(i, x, matrix);
            }
        }
    }
}
