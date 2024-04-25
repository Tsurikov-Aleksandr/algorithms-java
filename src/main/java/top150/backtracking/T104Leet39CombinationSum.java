package top150.backtracking;

import java.util.ArrayList;
import java.util.List;

public class T104Leet39CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ansewr = new ArrayList<>();
        backtrack(ansewr, new ArrayList<>(), candidates, target, 0);
        return ansewr;
    }

    private void backtrack(List<List<Integer>> ansewr, List<Integer> temp, int[] candidates, int target, int start) {
        if (target < 0) {
        } else if (target == 0) {
            ansewr.add(new ArrayList<>(temp));
        } else {
            for (int i = start; i < candidates.length; i++) {
                temp.add(candidates[i]);
                backtrack(ansewr, temp, candidates, target - candidates[i], i);
                temp.remove(temp.size() - 1);
            }
        }

    }
}
