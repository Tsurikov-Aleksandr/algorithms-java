package all.easy;

import java.util.ArrayList;
import java.util.List;

public class Easy94BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        traversal(root, answer);
        return answer;
    }

    private void traversal(TreeNode node, List<Integer> answer) {
        if (node == null) {
            return;
        }
        traversal(node.left, answer);
        answer.add(node.val);
        traversal(node.right, answer);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
