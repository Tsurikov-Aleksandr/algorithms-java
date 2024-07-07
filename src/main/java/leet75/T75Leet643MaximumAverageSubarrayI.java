package leet75;

public class T75Leet643MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int tempMaxSum = 0;
        int start = 0;
        int end = k;

        for (int i = 0; i < k; i++) {
            tempMaxSum += nums[i];
        }
        maxSum = tempMaxSum;

        while (end < nums.length) {
            tempMaxSum -= nums[start];
            tempMaxSum += nums[end];
            start++;
            end++;
            maxSum = Math.max(tempMaxSum, maxSum);
        }

        return (double) maxSum / k;
    }
}
