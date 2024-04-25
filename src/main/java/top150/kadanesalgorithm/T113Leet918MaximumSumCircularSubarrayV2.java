package top150.kadanesalgorithm;

public class T113Leet918MaximumSumCircularSubarrayV2 {
    public int maxSubarraySumCircular(int[] nums) {
        int nonCircular = kadanes(nums);
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            nums[i] = -nums[i];
        }
        int circular = total + kadanes(nums);

        if (circular == 0) {
            return nonCircular;
        } else {
            return Math.max(nonCircular, circular);
        }
    }

    private int kadanes(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int num : nums) {
            sum += num;
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
