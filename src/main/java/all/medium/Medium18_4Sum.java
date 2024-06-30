package all.medium;

import java.util.*;

public class Medium18_4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length - 3; i++) {
            for (int x = i + 1; x < nums.length - 2; x++) {
                int start = x + 1;
                int end = nums.length - 1;

                while (start < end) {
                    long tempSum = (long) nums[i] + (long) nums[x] + (long) nums[start] + (long) nums[end];
                    if (tempSum == target) {
                        List<Integer> l = Arrays.asList(nums[i], nums[x], nums[start], nums[end]);
                        if (!set.contains(l)) {
                            set.add(l);
                            answer.add(l);
                        }
                    }

                    if (tempSum < target) {
                        start++;
                    } else {
                        end--;
                    }

                }
            }
        }


        return answer;
    }
}
