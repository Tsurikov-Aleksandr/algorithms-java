package all.easy;

public class Easy111MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int nodeDepth = 1;
        return depth(nodeDepth, root);

    }

    private int depth(int nodeDepth, TreeNode node) {
        if (node.left == null && node.right == null) {
            return nodeDepth;
        }
        int l = node.left == null ? Integer.MAX_VALUE : depth(nodeDepth + 1, node.left);
        int r = node.right == null ? Integer.MAX_VALUE : depth(nodeDepth + 1, node.right);
        return Math.min(l, r);
    }
}
