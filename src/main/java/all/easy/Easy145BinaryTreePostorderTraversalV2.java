package all.easy;

import java.util.*;

public class Easy145BinaryTreePostorderTraversalV2 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        TreeNode p = root;

        while (p != null || !deque.isEmpty()) {
            if (p != null) {
                answer.add(p.val);
                deque.addLast(p);
                p = p.right;
            } else {
                p = deque.pollLast();
                p = p.left;
            }
        }

        Collections.reverse(answer);
        return answer;
    }
}
