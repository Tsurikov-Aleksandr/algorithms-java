package top150.binarytreegeneral;

import java.util.ArrayDeque;
import java.util.Deque;

public class T70Leet226InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        while (!deque.isEmpty()){
            TreeNode x = deque.poll();
            TreeNode temp = x.left;
            x.left = x.right;
            x.right = temp;
            if(x.left != null){
                deque.add(x.left);
            }
            if(x.right != null){
                deque.add(x.right);
            }
        }

        return root;
    }
}
