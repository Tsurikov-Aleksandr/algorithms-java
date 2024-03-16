package top150.binarytreegeneral;

import java.util.Deque;
import java.util.LinkedList;

public class T71Leet101SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        Deque<TreeNode> deque = new LinkedList<>();

        if (root.left != null) {
            if (root.right == null) {
                return false;
            }
            deque.add(root.left);
            deque.add(root.right);
        } else if (root.right != null) {
            return false;
        }

        while (!deque.isEmpty()) {
            if (deque.size() % 2 != 0) {
                return false;
            }

            TreeNode right = deque.poll();
            TreeNode left = deque.poll();

            if (right.val != left.val) {
                return false;
            }

            if (left.left != null) {
                if (right.right == null) {
                    return false;
                }
                deque.add(left.left);
                deque.add(right.right);
            } else if (right.right != null) {
                return false;
            }

            if (left.right != null) {
                if (right.left == null) {
                    return false;
                }
                deque.add(left.right);
                deque.add(right.left);
            } else if (right.left != null) {
                return false;
            }
        }

        return true;
    }
}
