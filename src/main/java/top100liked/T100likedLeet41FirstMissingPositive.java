package top100liked;

import java.util.HashSet;
import java.util.Set;

public class T100likedLeet41FirstMissingPositive {
    //13 ms Beats 28.40%
    public int firstMissingPositive1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            if (x > 0) {
                set.add(x);
            }
        }

        int answer = 1;

        while (set.contains(answer)) {
            answer++;
        }

        return answer;
    }

    //1 ms Beats 100.00%

    public int firstMissingPositive2(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }

        return nums.length + 1;
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
