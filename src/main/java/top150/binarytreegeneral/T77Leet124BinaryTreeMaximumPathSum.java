package top150.binarytreegeneral;

public class T77Leet124BinaryTreeMaximumPathSum {
    private int maxValue = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        postorder(root);
        return maxValue;
    }

    private int postorder(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = Math.max(0, postorder(node.left));
        int rigth = Math.max(0, postorder(node.right));
        maxValue = Math.max(maxValue, left + rigth + node.val);
        return Math.max(left, rigth) + node.val;
    }
}
