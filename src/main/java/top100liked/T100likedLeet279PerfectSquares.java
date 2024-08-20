package top100liked;

import java.util.Arrays;

public class T100likedLeet279PerfectSquares {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int min_val = Integer.MAX_VALUE;

            for (int j = 1; j * j <= i; j++) {
                int square = j * j;
                min_val = Math.min(min_val, dp[i - square] + 1);
            }

            dp[i] = min_val;
        }

        return dp[n];
    }
}
