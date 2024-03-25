package top150.binarytreegeneral;

public class T79Leet236LowestCommonAncestorOfABinaryTree {

    TreeNode result;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        findLCA(root, p, q);
        return result;
    }

    private boolean findLCA(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }

        boolean left = findLCA(root.left, p, q);
        boolean rigth = findLCA(root.right, p, q);

        boolean curr = (root == p) || (root == q);

        if (left && rigth || left && curr || rigth && curr) {
            result = root;
        }

        return left || rigth || curr;

    }
}
