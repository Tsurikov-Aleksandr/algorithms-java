package leet75;

public class T75Leet1493LongestSubarrayOf1sAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int start = 0;
        int end = 0;
        int tempZero = 0;

        while (end < nums.length) {
            if (nums[end] == 0) {
                tempZero++;
            }
            end++;
            if (tempZero > 1) {
                if (nums[start] == 0) {
                    tempZero--;
                }
                start++;
            }
        }

        return end - start - 1;
    }
}
