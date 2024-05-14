package all.easy;

public class Easy110BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return getDepth(root) != -1;
    }

    private int getDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = getDepth(node.left);
        int right = getDepth(node.right);

        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }
}


