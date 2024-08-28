package all.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Medium47PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);

        backtracking(answer, new ArrayList<>(), nums, new boolean[nums.length]);

        return answer;
    }

    private void backtracking(List<List<Integer>> answer, List<Integer> temp, int[] nums, boolean[] visited) {
        if (temp.size() == nums.length) {
            answer.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }

            if (i > 0 && !visited[i - 1] && nums[i] == nums[i - 1]) {
                continue;
            }

            visited[i] = true;
            temp.add(nums[i]);

            backtracking(answer, temp, nums, visited);

            temp.remove(temp.size() - 1);
            visited[i] = false;
        }
    }

}
