package all.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class Easy404SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addLast(root);
        int s = 0;
        while (!deque.isEmpty()) {
            TreeNode node = deque.pollFirst();
            if (node.left != null) {
                if (node.left.left == null && node.left.right == null) {
                    s += node.left.val;
                }
                deque.addLast(node.left);
            }
            if (node.right != null) {
                deque.addLast(node.right);
            }
        }
        return s;
    }
}
