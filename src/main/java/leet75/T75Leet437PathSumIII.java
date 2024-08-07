package leet75;

import java.util.HashMap;
import java.util.Map;

public class T75Leet437PathSumIII {
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0L, 1);
        return dfs(root, 0, targetSum, prefixSumCount);
    }

    private int dfs(TreeNode root, long currentSum, int targetSum, Map<Long, Integer> prefixSumCount) {
        if (root == null) {
            return 0;
        }
        currentSum += root.val;
        int numPathsToCurrent = prefixSumCount.getOrDefault(currentSum - targetSum, 0);
        prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        int result = numPathsToCurrent + dfs(root.left, currentSum, targetSum, prefixSumCount) + dfs(root.right, currentSum, targetSum, prefixSumCount);
        prefixSumCount.put(currentSum, prefixSumCount.get(currentSum) - 1);
        return result;
    }

}
