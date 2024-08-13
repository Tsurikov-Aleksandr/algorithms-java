package top100liked;

public class T100liked152MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int answer = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(maxProduct * nums[i], nums[i]);

            minProduct = Math.min(minProduct * nums[i], nums[i]);

            answer = Math.max(answer, maxProduct);

        }

        return answer;
    }
}
