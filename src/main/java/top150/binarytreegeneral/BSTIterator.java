package top150.binarytreegeneral;

public class BSTIterator {
    private TreeNode curr;

    public BSTIterator(TreeNode root) {
        TreeNode prev;
        curr = root;
        while (curr != null) {
            if (curr.left == null) {
                curr = curr.right;
            } else {
                prev = curr.left;
                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }

                if (prev.right == null) {
                    prev.right = curr;
                    curr = curr.left;
                } else {
                    curr = curr.right;
                }
            }
        }

        curr = root;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
    }

    public boolean hasNext() {
        return curr != null;
    }

    public int next() {
        int result = curr.val;

        TreeNode next = curr.right;
        if (next == null) {
            curr = next;
        } else if (next.left == null || next.left.val > curr.val) {
            curr = next;
            while (curr.left != null)
                curr = curr.left;
        } else {
            curr.right = null;
            curr = next;
        }

        return result;
    }
}
