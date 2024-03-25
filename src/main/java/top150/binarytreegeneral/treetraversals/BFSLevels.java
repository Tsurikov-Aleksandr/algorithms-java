package top150.binarytreegeneral.treetraversals;

import java.util.ArrayDeque;
import java.util.Deque;

public class BFSLevels {
    public int BFSLevels(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addLast(root);
        int level = 0;

        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pollFirst();
                if (node.left != null) {
                    deque.addLast(node.left);
                }
                if (node.right != null) {
                    deque.addLast(node.right);
                }

            }
            level++;
        }
        return level;
    }
}
