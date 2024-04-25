package top150.kadanesalgorithm;

public class T113Leet918MaximumSumCircularSubarray {
    public int maxSubarraySumCircular(int[] nums) {
        int globalMax = nums[0];
        int globalMin = nums[0];
        int curMax = 0;
        int curMin = 0;
        int total = 0;
        for (int num : nums) {
            curMax = Math.max(curMax + num, num);
            curMin = Math.min(curMin + num, num);
            total += num;
            globalMax = Math.max(globalMax, curMax);
            globalMin = Math.min(globalMin, curMin);
        }

        if (globalMax > 0) {
            return Math.max(globalMax, total - globalMin);
        } else {
            return globalMax;
        }
    }

}
