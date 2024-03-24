package top150.binarytreebfs;

import java.util.*;

public class T82Leet199BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {

        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> answer = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addLast(root);

        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pollFirst();
                if (i == size - 1) {
                    answer.add(node.val);
                }
                if (node.left != null) {
                    deque.addLast(node.left);
                }
                if (node.right != null) {
                    deque.addLast(node.right);
                }

            }

        }
        return answer;

    }
}
