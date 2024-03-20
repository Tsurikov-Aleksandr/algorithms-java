package top150.binarytreegeneral;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class T76Leet129SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Deque<TreeNode> path = new LinkedList<>();
        Deque<Integer> sumPath = new LinkedList<>();
        List<Integer> sumList = new ArrayList<>();

        path.add(root);
        sumPath.add(root.val);

        while (!path.isEmpty()) {
            TreeNode temp = path.poll();
            Integer tempVal = sumPath.poll();

            if (temp.right == null && temp.left == null) {
                sumList.add(tempVal);
            }

            if (temp.right != null) {
                path.add(temp.right);
                sumPath.add(temp.right.val + (tempVal * 10));
            }
            if (temp.left != null) {
                path.add(temp.left);
                sumPath.add(temp.left.val + (tempVal * 10));
            }

        }

        return sumList.stream().reduce(0, Integer::sum);
    }
}
