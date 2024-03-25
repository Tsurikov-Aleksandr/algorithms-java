package top150.binarytreegeneral;


import java.util.Deque;
import java.util.LinkedList;

public class T69Leet100SameTreeV2 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Deque<TreeNode> pDeque = new LinkedList<>();
        Deque<TreeNode> qDeque = new LinkedList<>();

        pDeque.offer(p);
        qDeque.offer(q);

        while (!pDeque.isEmpty() && !qDeque.isEmpty()) {
            TreeNode pNode = pDeque.poll();
            TreeNode qNode = qDeque.poll();

            if (pNode == null && qNode == null) {
                continue;
            }
            if (pNode == null || qNode == null || pNode.val != qNode.val) {
                return false;
            }

            pDeque.offer(pNode.left);
            pDeque.offer(pNode.right);
            qDeque.offer(qNode.left);
            qDeque.offer(qNode.right);
        }

        return pDeque.isEmpty() && qDeque.isEmpty();
    }
}
