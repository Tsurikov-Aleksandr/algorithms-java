package top100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leet1TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer complementIdex = complements.get(nums[i]);
            if (complementIdex != null) {
                return new int[]{i, complementIdex};
            }
            complements.put(target - nums[i], i);
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] t1 = {2, 7, 11, 15}; // [0, 1]
        int target1 = 9;
        int[] t2 = {3, 2, 4}; // [1, 2]
        int target2 = 6;
        int[] t3 = {3, 3}; // [0, 1]
        int target3 = 6;

        System.out.println(Arrays.toString(twoSum(t1, target1)));
        System.out.println(Arrays.toString(twoSum(t2, target2)));
        System.out.println(Arrays.toString(twoSum(t3, target3)));
    }
}
