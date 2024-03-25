package top150.binarytreegeneral;

import java.util.Deque;
import java.util.LinkedList;

public class T76Leet112PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        Deque<TreeNode> path = new LinkedList<>();
        Deque<Integer> sumPath = new LinkedList<>();

        path.add(root);
        sumPath.add(root.val);

        while (!path.isEmpty()) {
            TreeNode temp = path.poll();
            Integer tempVal = sumPath.poll();

            if (temp.right == null && temp.left == null && tempVal == targetSum) {
                return true;
            }

            if (temp.right != null) {
                path.add(temp.right);
                sumPath.add(temp.right.val + tempVal);
            }
            if (temp.left != null) {
                path.add(temp.left);
                sumPath.add(temp.left.val + tempVal);
            }

        }

        return false;
    }
}
