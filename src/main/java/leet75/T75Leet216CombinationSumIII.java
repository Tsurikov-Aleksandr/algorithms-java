package leet75;

import java.util.ArrayList;
import java.util.List;

public class T75Leet216CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> answer = new ArrayList<>();

        dfs(answer, new ArrayList<>(), k, 1, n);

        return answer;
    }

    private void dfs(List<List<Integer>> answer, List<Integer> comb, int k, int start, int n) {
        if (comb.size() == k && n == 0) {
            answer.add(new ArrayList<>(comb));
            return;
        }

        for (int i = start; i <= 9; i++) {
            comb.add(i);
            dfs(answer, comb, k, i + 1, n - i);
            comb.remove(comb.size() - 1);
        }
    }
}
