package top150.binarytreegeneral.treetraversals;

import java.util.ArrayDeque;
import java.util.Deque;

public class DFS {
    //Depth-first search
    public void depthFirstSearch(TreeNode root) {
        if (root == null) {
            return;
        }

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addLast(root);

        while (!deque.isEmpty()) {
            TreeNode node = deque.pollLast();
            System.out.println(node.val);
            if (node.left != null) {
                deque.addLast(node.left);
            }
            if (node.right != null) {
                deque.addLast(node.right);
            }
        }

    }
}
