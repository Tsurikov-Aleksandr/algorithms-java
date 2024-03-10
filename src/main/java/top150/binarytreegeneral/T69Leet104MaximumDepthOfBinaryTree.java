package top150.binarytreegeneral;

public class T69Leet104MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMaxDepth = maxDepth(root.left);
        int rigthMaxDepth = maxDepth(root.right);

        if (leftMaxDepth > rigthMaxDepth) {
            return leftMaxDepth + 1;
        } else {
            return rigthMaxDepth + 1;
        }
    }
}
