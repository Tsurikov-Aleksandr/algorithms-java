package top150.slidingwindow;

public class T30Leet209MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int start = 0;
        int total = 0;
        int minLen = nums.length + 1;

        for (int end = 0; end < nums.length; end++) {
            total += nums[end];
            while (total >= target) {
                minLen = Math.min(end - start + 1, minLen);
                total -= nums[start];
                start++;
            }

        }
        if (minLen == nums.length + 1) {
            return 0;
        }
        return minLen;
    }
}
