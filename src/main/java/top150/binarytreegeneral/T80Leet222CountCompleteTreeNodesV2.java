package top150.binarytreegeneral;

public class T80Leet222CountCompleteTreeNodesV2 {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return countNodes(root.right) + countNodes(root.left) + 1;
    }
}
