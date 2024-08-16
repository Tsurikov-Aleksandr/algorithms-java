package top100liked;

public class T100likedLeet416PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }

        if (sum % 2 != 0) {
            return false;
        }

        sum /= 2;

        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;

        for (int x : nums) {
            for (int i = sum; i >= x; i--) {
                    dp[i] = dp[i] || dp[i - x];
            }
        }

        return dp[sum];
    }
}
