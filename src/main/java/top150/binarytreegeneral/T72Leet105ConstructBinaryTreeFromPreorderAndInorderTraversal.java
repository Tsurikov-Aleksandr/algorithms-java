package top150.binarytreegeneral;

import java.util.Arrays;

public class T72Leet105ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || inorder.length == 0 || preorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);

        if (preorder.length == 1) {
            return root;
        }

        int breakindex = -1;

        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                breakindex = i;
                break;
            }
        }
        int[] LeftPreorder = Arrays.copyOfRange(preorder, 1, breakindex + 1);
        int[] LeftInorder = Arrays.copyOfRange(inorder, 0, breakindex);
        int[] RightPreorder = Arrays.copyOfRange(preorder, breakindex + 1, preorder.length);
        int[] RightInorder = Arrays.copyOfRange(inorder, breakindex + 1, inorder.length);

        root.left = buildTree(LeftPreorder, LeftInorder);
        root.right = buildTree(RightPreorder, RightInorder);

        return root;
    }
}
