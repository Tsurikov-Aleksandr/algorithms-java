package all.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Medium40CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(candidates);

        backtrack(answer, new ArrayList<>(), candidates, target, 0);

        return answer;
    }

    private void backtrack(List<List<Integer>> answer,
                           List<Integer> tempList,
                           int[] candidates,
                           int target,
                           int start) {

        if (target == 0) {
            answer.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue; //skip duplicates
            }
            if(candidates[i] > target){
                break;
            }
            tempList.add(candidates[i]);
            backtrack(answer, tempList, candidates, target - candidates[i], i + 1);
            tempList.remove(tempList.size() - 1);

        }
    }


}
