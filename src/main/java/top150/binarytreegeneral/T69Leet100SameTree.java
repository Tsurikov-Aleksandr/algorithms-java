package top150.binarytreegeneral;

import java.util.ArrayDeque;
import java.util.Deque;

public class T69Leet100SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        Deque<TreeNode> pDeque = new ArrayDeque<>();
        pDeque.push(p);
        Deque<TreeNode> qDeque = new ArrayDeque<>();
        qDeque.push(q);

        while (!pDeque.isEmpty() && !qDeque.isEmpty()) {
            TreeNode tq = qDeque.pop();
            TreeNode tp = pDeque.pop();
            if (tp.val != tq.val) {
                return false;
            }
            if ((tp.left == null && tq.left != null) || (tp.left != null && tq.left == null)) {
                return false;
            }
            if ((tp.right == null && tq.right != null) || (tp.right != null && tq.right == null)) {
                return false;
            }

            if (tp.left != null) {
                pDeque.offer(tp.left);
            }
            if (tp.right != null) {
                pDeque.offer(tp.right);
            }
            if (tq.left != null) {
                qDeque.offer(tq.left);
            }
            if (tq.right != null) {
                qDeque.offer(tq.right);
            }
        }

        return pDeque.isEmpty() && qDeque.isEmpty();
    }
}
