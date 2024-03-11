package top150.binarytreegeneral;

import java.util.ArrayDeque;
import java.util.Deque;

public class T69Leet104MaximumDepthOfBinaryTreeBFS {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        int level = 0;

        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.poll();
                if (node.left != null) {
                    deque.add(node.left);
                }
                if (node.right != null) {
                    deque.add(node.right);
                }

            }
            level++;
        }
        return level;
    }
}
