package top150.binarysearchtree;

import java.util.ArrayDeque;
import java.util.Deque;

public class T87Leet230KthSmallestElementInABSTIterative {
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode node = root;
        int count = 0;

        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.addLast(node);  // similar to calling dfs(root.left)
                node = node.left;
            } else {
                node = stack.pollLast();
                //---------- real code starts here ----------
                count++;
                if (count == k) {
                    return node.val;
                }
                //-------------------------------------------
                node = node.right;  // similar to calling dfs(root.right)
            }
        }

        return Integer.MIN_VALUE;
    }
}
