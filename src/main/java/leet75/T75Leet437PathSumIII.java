package leet75;

public class T75Leet437PathSumIII {
    int answer = 0;

    public int pathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return 0;
        }

        dfs(root, targetSum, 0);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return answer;
    }

    private void dfs(TreeNode root, int sum, long currentSum) {
        if (root == null) {
            return;
        }
        currentSum += root.val;
        if (currentSum == sum) {
            answer++;
        }
        dfs(root.left, sum, currentSum);
        dfs(root.right, sum, currentSum);
    }

}
