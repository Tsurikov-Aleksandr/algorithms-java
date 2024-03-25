package top150.binarytreebfs;

import java.util.*;

public class T85Leet103BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<List<Integer>> answer = new ArrayList<>();
        boolean zigzag = false;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addLast(root);

        while (!deque.isEmpty()) {
            int size = deque.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pollFirst();
                list.add(node.val);
                if (node.left != null) {
                    deque.addLast(node.left);
                }
                if (node.right != null) {
                    deque.addLast(node.right);
                }

            }
            if (zigzag) {
                Collections.reverse(list);
                zigzag = false;
            } else {
                zigzag = true;
            }
            answer.add(list);
        }
        return answer;
    }
}
