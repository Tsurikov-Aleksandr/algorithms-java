package top150.matrix;

import java.util.ArrayList;
import java.util.List;

public class T35Leet54SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        int left = 0;
        int rigth = matrix[0].length;
        int top = 0;
        int bottom = matrix.length;

        while (left < rigth && top < bottom) {

            for (int i = left; i < rigth; i++) {
                answer.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i < bottom; i++) {
                answer.add(matrix[i][rigth - 1]);
            }
            rigth--;

            if (left >= rigth || top >= bottom) {
                break;
            }

            for (int i = rigth - 1; i > left - 1; i--) {
                answer.add(matrix[bottom - 1][i]);
            }
            bottom--;

            for (int i = bottom - 1; i > top - 1; i--) {
                answer.add(matrix[i][left]);
            }
            left++;

        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // [1,2,3,6,9,8,7,4,5]
        int[][] matrix2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}; // [1,2,3,4,8,12,11,10,9,5,6,7]
        int[][] matrix3 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] matrix4 = {{1, 2}, {3, 4}};
        int[][] matrix5 = {{2, 3, 4},
                {5, 6, 7},
                {8, 9, 10},
                {11, 12, 13},
                {14, 15, 16}};
        //[2,3,4,7,10,13,16,15,14,11,8,5,6,9,12]
        System.out.println(spiralOrder(matrix5));
    }
}
