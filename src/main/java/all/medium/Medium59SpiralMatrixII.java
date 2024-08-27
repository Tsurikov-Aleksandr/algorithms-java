package all.medium;

public class Medium59SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int left = 0;
        int rigth = n;
        int top = 0;
        int bottom = n;
        int[][] answer = new int[n][n];
        int count = 1;

        while (left < rigth && top < bottom) {

            for (int i = left; i < rigth; i++) {
                answer[top][i] = count;
                count++;
            }
            top++;

            for (int i = top; i < bottom; i++) {
                answer[i][rigth - 1] = count;
                count++;
            }
            rigth--;

            if (left >= rigth || top >= bottom) {
                break;
            }

            for (int i = rigth - 1; i > left - 1; i--) {
                answer[bottom - 1][i] = count;
                count++;
            }
            bottom--;

            for (int i = bottom - 1; i > top - 1; i--) {
                answer[i][left] = count;
                count++;
            }
            left++;

        }

        return answer;
    }
}
