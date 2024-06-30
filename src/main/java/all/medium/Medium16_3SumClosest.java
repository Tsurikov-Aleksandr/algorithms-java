package all.medium;

import java.util.Arrays;

public class Medium16_3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int resalt = nums[0] + nums[1] + nums[2];
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int tempSum = nums[i] + nums[start] + nums[end];
                if (tempSum == target) {
                    return tempSum;
                }

                if (tempSum < target) {
                    start++;
                } else {
                    end--;
                }

                int diff = Math.abs(tempSum - target);

                if(diff < minDiff){
                    resalt = tempSum;
                    minDiff = diff;
                }

            }

        }

        return resalt;

    }
}
