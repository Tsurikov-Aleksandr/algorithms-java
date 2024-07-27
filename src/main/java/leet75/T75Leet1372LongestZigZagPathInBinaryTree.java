package leet75;

public class T75Leet1372LongestZigZagPathInBinaryTree {
    public int maxPath = 0;

    public int longestZigZag(TreeNode root) {
        if (root == null) {
            return 0;
        }

        dfs(root, false, 0);
        dfs(root, true, 0);

        return maxPath;
    }

    private void dfs(TreeNode root, boolean dir, int currPath) {
        if (root == null) {
            return;
        }

        maxPath = Math.max(maxPath, currPath);

        if (dir) {
            dfs(root.left, false, currPath + 1);
            dfs(root.right, true, 1);
        } else {
            dfs(root.right, true, currPath + 1);
            dfs(root.left, false, 1);
        }
    }
}
