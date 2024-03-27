package top150.binarysearchtree;

import java.util.ArrayDeque;
import java.util.Deque;

public class T88Leet98ValidateBinarySearchTreeIterative {
    public boolean isValidBST(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        TreeNode node = root;

        TreeNode prev = null;
        boolean valid = true;

        while (node != null || !deque.isEmpty()) {
            if (node != null) {
                deque.addLast(node);
                node = node.left;
            } else {
                node = deque.pollLast();
                if (prev != null) {
                    if (prev.val >= node.val) {
                        return false;
                    }
                    prev = node;
                } else {
                    prev = node;
                }
                node = node.right;
            }
        }

        return true;
    }

}
