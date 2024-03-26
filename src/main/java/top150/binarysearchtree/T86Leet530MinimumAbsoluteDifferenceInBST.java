package top150.binarysearchtree;

public class T86Leet530MinimumAbsoluteDifferenceInBST {
    int difference = Integer.MAX_VALUE;
    Integer prev = null;

    //inorder traverse , Left -> Value -> Rigth
    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return difference;
        }

        getMinimumDifference(root.left);

        if (prev != null) {
            difference = Math.min(difference, root.val - prev);
        }
        prev = root.val;

        getMinimumDifference(root.right);

        return difference;
    }
}
