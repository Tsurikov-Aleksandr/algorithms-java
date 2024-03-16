package top150.binarytreegeneral;

public class T80Leet222CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        TreeNode point = root;
        int leftDepth = 0;
        while (point != null) {
            point = point.left;
            leftDepth++;
        }

        point = root;
        int rightDepth = 0;
        while (point != null) {
            point = point.right;
            rightDepth++;
        }

        if (leftDepth == rightDepth) {
            return (int) Math.pow(2, leftDepth) - 1;
        } else {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }

    }

}
