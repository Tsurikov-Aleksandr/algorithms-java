package top150.binarytreegeneral;

import java.util.ArrayDeque;
import java.util.Deque;

public class T75Leet114FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addLast(root);
        TreeNode dummyHead = new TreeNode();

        while (!deque.isEmpty()){
            TreeNode temp = deque.pollLast();
            dummyHead.right = temp;
            dummyHead.left = null;
            dummyHead = dummyHead.right;
            if(temp.right != null){
                deque.addLast(temp.right);
            }
            if (temp.left != null){
                deque.addLast(temp.left);
            }
        }
        root.left = null;

    }
}
