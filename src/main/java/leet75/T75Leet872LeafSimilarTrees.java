package leet75;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class T75Leet872LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Deque<TreeNode> deque1 = new ArrayDeque<>();
        List<Integer> list1 = new ArrayList<>();
        deque1.addLast(root1);

        while (!deque1.isEmpty()) {
            TreeNode node = deque1.pollFirst();
            if (node.left == null && node.right == null) {
                list1.add(node.val);
                continue;
            }
            if (node.left != null) {
                deque1.addFirst(node.left);
            }
            if (node.right != null) {
                deque1.addFirst(node.right);
            }
        }

        Deque<TreeNode> deque2 = new ArrayDeque<>();
        List<Integer> list2 = new ArrayList<>();
        deque2.addLast(root2);

        while (!deque2.isEmpty()) {
            TreeNode node = deque2.pollFirst();
            if (node.left == null && node.right == null) {
                list2.add(node.val);
                continue;
            }
            if (node.left != null) {
                deque2.addFirst(node.left);
            }
            if (node.right != null) {
                deque2.addFirst(node.right);
            }
        }

        return list1.equals(list2);
    }
}
