package top150.binarytreegeneral;

import java.util.ArrayList;
import java.util.List;

public class BSTIteratorV2 {
    private final List<Integer> valuesInOrder = new ArrayList<>();
    private int currentIndex = -1;

    public BSTIteratorV2(TreeNode root) {
        traverseInOrder(root);
    }

    public int next() {
        currentIndex++;
        return valuesInOrder.get(currentIndex);
    }

    public boolean hasNext() {
        return currentIndex + 1 < valuesInOrder.size();
    }

    private void traverseInOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        traverseInOrder(root.left);
        valuesInOrder.add(root.val);
        traverseInOrder(root.right);
    }
}
