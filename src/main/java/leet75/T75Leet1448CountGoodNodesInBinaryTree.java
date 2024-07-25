package leet75;

public class T75Leet1448CountGoodNodesInBinaryTree {
    int answer = 0;

    public int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return answer;
    }

    private void dfs(TreeNode node, int maxVal) {
        if (node == null) {
            return;
        }

        if (node.val >= maxVal) {
            answer++;
            maxVal = node.val;
        }

        dfs(node.left, maxVal);
        dfs(node.right, maxVal);
    }
}
