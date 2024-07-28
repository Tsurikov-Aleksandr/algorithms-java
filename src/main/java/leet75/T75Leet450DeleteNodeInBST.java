package leet75;

public class T75Leet450DeleteNodeInBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }

        if (root.val == key) {
            root = delete(root, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            root.left = deleteNode(root.left, key);
        }

        return root;
    }

    private TreeNode delete(TreeNode root, int key) {
        if (root.left == null && root.right == null) {
            return null;
        }
        if (root.left == null) {
            return root.right;
        }
        if (root.right == null) {
            return root.left;
        }

        TreeNode tempNode = root.right;

        while (tempNode.left != null) {
            tempNode = tempNode.left;
        }
        tempNode.left = root.left;

        return root.right;
    }
}
