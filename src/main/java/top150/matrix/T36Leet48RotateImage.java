package top150.matrix;

public class T36Leet48RotateImage {
    public void rotate(int[][] matrix) {
        if (matrix.length == 1) {
            return;
        }
        if (matrix.length == 2) {
            int temp = matrix[0][0];
            matrix[0][0] = matrix[1][0];
            matrix[1][0] = matrix[1][1];
            matrix[1][1] = matrix[0][1];
            matrix[0][1] = temp;
            return;
        }

        int shift = 0;

        while (matrix.length - shift > shift) {
            // углы
            int temp = matrix[shift][shift];
            matrix[shift][shift] = matrix[matrix.length - shift - 1][shift]; // 1 =4
            matrix[matrix.length - shift - 1][shift] = matrix[matrix.length - shift - 1][matrix.length - shift - 1]; // 4 = 3
            matrix[matrix.length - shift - 1][matrix.length - shift - 1] = matrix[shift][matrix.length - shift - 1];// 3 = 2
            matrix[shift][matrix.length - shift - 1] = temp; // 2 = 1(temp)

            //линии
            for (int i = shift + 1; i < matrix.length - shift - 1; i++) {
                int tempx = matrix[shift][i];
                matrix[shift][i] = matrix[matrix.length - i - 1][shift];// 1 =4
                matrix[matrix.length - i - 1][shift] = matrix[matrix.length - shift - 1][matrix.length - i - 1];// 4 = 3
                matrix[matrix.length - shift - 1][matrix.length - i - 1] = matrix[i][matrix.length - shift - 1]; // 3 = 2
                matrix[i][matrix.length - shift - 1] = tempx;// 2 = 1(temp)
            }
            shift++;
        }

    }
}
