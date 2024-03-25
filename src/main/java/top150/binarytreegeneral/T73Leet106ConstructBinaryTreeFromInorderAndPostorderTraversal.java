package top150.binarytreegeneral;

import java.util.HashMap;
import java.util.Map;

public class T73Leet106ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length) {
            return null;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return buldInorderPosorderTree(
                0, inorder.length - 1,
                postorder, 0, postorder.length - 1,
                map);

    }

    private TreeNode buldInorderPosorderTree(int iStart, int iEnd,
                                             int[] postorder, int pStart, int pEnd,
                                             Map<Integer, Integer> map) {
        if (pStart > pEnd || iStart > iEnd) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[pEnd]);
        int inRoot = map.get(postorder[pEnd]);
        int numsLeft = inRoot - iStart;

        root.left = buldInorderPosorderTree(
                iStart, inRoot - 1,
                postorder, pStart, pStart + numsLeft - 1,
                map);

        root.right = buldInorderPosorderTree(
                inRoot + 1, iEnd,
                postorder, pStart + numsLeft, pEnd - 1,
                map);

        return root;
    }


}
