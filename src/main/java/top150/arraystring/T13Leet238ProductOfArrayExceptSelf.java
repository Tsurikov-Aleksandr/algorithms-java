package top150.arraystring;

import java.util.Arrays;

public class T13Leet238ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int[] answer = new int[nums.length];
        int m = 1;
        for (int i = 0; i < nums.length; i++) {
            m *= nums[i];
            prefix[i] = m;
        }
        m = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            m *= nums[i];
            postfix[i] = m;
        }
        answer[0] = postfix[1];
        answer[nums.length - 1] = prefix[nums.length - 2];
        for (int i = 1; i < nums.length - 1; i++) {
            answer[i] = prefix[i - 1] * postfix[i + 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4}; // [24, 12, 8, 6]
        int[] nums2 = {-1, 1, 0, -3, 3}; // [0, 0, 9, 0, 0]
        int[] nums3 = {1, 2, 3}; // [6, 3, 2]
        int[] nums4 = {1, 2}; // [2, 1]
        int[] nums5 = {1}; // [1]

        Arrays.stream(productExceptSelf(nums2)).forEach(System.out::print);
    }
}
