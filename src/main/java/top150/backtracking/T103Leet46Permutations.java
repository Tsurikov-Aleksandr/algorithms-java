package top150.backtracking;

import java.util.ArrayList;
import java.util.List;

public class T103Leet46Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        mute(answer, new ArrayList<>(), nums);
        return answer;
    }

    private void mute(List<List<Integer>> answer, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            answer.add(new ArrayList<>(temp));
        }
        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i])) {
                continue;
            }
            temp.add(nums[i]);
            mute(answer, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }
}
