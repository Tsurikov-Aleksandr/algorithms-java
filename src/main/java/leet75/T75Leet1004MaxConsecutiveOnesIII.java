package leet75;

public class T75Leet1004MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int tempZero = 0;

        while (end < nums.length) {
            if (nums[end] == 0) {
                tempZero++;
            }
            end++;
            if (tempZero > k) {
                if (nums[start] == 0) {
                    tempZero--;
                }
                start++;
            }
        }

        return end - start;
    }
}
