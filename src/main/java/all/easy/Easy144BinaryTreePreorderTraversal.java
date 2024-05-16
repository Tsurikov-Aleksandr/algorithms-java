package all.easy;

import java.util.*;

public class Easy144BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addLast(root);
        List<Integer> answer = new ArrayList<>();

        while (!deque.isEmpty()) {
            TreeNode temp = deque.pollLast();
            answer.add(temp.val);
            if (temp.right != null) {
                deque.addLast(temp.right);
            }
            if (temp.left != null) {
                deque.addLast(temp.left);
            }
        }
        return answer;
    }
}
