package top150.dp1d;

import java.util.Arrays;

public class T141Leet300LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        for (int i = 1; i < nums.length; i++) {
            for (int x = 0; x < i; x++) {
                if (nums[i] > nums[x]) {
                    dp[i] = Math.max(dp[i], dp[x] + 1);
                }
            }
        }

        return Arrays.stream(dp).max().orElse(0);

    }
}
