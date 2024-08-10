package top100liked;


public class T100likedLeet543DiameterOfBinaryTree {
    int answer = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        height(root);

        return answer;
    }

    public int height(TreeNode root) {
        if (root == null) {
            return -1;
        }

        int l = height(root.left);
        int r = height(root.right);

        answer = Math.max(answer, l + r + 2);

        return Math.max(l, r) + 1;
    }
}
