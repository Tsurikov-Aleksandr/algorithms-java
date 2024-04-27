package top150.binarysearch;

public class T115Leet74Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        int end = row * col - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int mid_val = matrix[mid / col][mid % col];

            if (mid_val == target) {
                return true;
            }
            if (mid_val < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
