package top150.dpmultidimensional;

import java.util.Arrays;
import java.util.List;

public class T142Leet120Triangle {
    public int minSum(List<List<Integer>> triangle, int i, int j, int m, int[][] dp) {
        if (i == m) {
            return triangle.get(i).get(j);
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int down1 = triangle.get(i).get(j) + minSum(triangle, i + 1, j, m, dp);
        int down2 = triangle.get(i).get(j) + minSum(triangle, i + 1, j + 1, m, dp);
        return dp[i][j] = Math.min(down1, down2);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int[][] dp = new int[m][m];
        for (int[] ele : dp) {
            Arrays.fill(ele, -1);
        }
        return minSum(triangle, 0, 0, m - 1, dp);
    }
}
