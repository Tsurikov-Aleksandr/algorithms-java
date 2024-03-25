package top150.binarytreebfs;

import java.util.*;

public class T83Leet637AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        Deque<TreeNode> deque = new ArrayDeque<>();
        List<Double> list = new ArrayList<>();

        deque.add(root);


        while (!deque.isEmpty()) {
            int size = deque.size();
            long avgVal = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.poll();
                avgVal += node.val;

                if (node.left != null) {
                    deque.add(node.left);
                }
                if (node.right != null) {
                    deque.add(node.right);
                }

            }
            list.add(avgVal/(double)size);
        }

        return list;

    }
}
