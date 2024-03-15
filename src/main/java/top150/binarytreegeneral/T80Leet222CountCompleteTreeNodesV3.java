package top150.binarytreegeneral;

import java.util.Deque;
import java.util.LinkedList;

public class T80Leet222CountCompleteTreeNodesV3 {

    // slow 4 ms
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);

        while (!deque.isEmpty()) {
            TreeNode temp = deque.poll();
            count++;
            if (temp.left != null) {
                deque.add(temp.left);
            }
            if (temp.right != null) {
                deque.add(temp.right);
            }
        }
        return count;
    }
}
