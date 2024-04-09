package top150.binarytreegeneral.treetraversals;

import java.util.ArrayDeque;
import java.util.Deque;

public class DFSInorderIterative {
    public void DFSIteractive(TreeNode root) {
        if (root == null) {
            return;
        }

        Deque<TreeNode> deque = new ArrayDeque<>();
        TreeNode node = root;

        while (node != null || !deque.isEmpty()) {
            if (node != null) {
                deque.addLast(node);  // similar to calling dfs(root.left)
                node = node.left;
            } else {
                node = deque.pollLast();
                //---------- real code starts here ----------
                System.out.println(node.val);
                //-------------------------------------------
                node = node.right;  // similar to calling dfs(root.right)
            }
        }
    }
}
