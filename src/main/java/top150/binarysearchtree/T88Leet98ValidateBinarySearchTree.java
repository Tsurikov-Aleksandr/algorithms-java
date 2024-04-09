package top150.binarysearchtree;

public class T88Leet98ValidateBinarySearchTree {

    TreeNode prev = null;
    boolean valid = true;

    public boolean isValidBST(TreeNode root) {
        traverse(root);
        return valid;
    }

    private void traverse(TreeNode node) {
        if (node == null) {
            return;
        }
        traverse(node.left);

        if (prev != null) {
            if (prev.val >= node.val) {
                valid = false;
            }
            prev = node;
        } else {
            prev = node;
        }

        traverse(node.right);

    }
}
