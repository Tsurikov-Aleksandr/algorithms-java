package top150.kadanesalgorithm;

public class T112Leet53MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = 0;
        int maxNum = nums[0];
        int tempSum = 0;
        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
            tempSum += num;
            maxSum = Math.max(maxSum, tempSum);
            if (tempSum < 0) {
                tempSum = 0;
            }

        }
        if (maxSum == 0) {
            return maxNum;
        }
        return maxSum;
    }
}
