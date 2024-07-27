package leet75;

import java.util.ArrayDeque;
import java.util.Deque;

public class T75Leet1161MaximumLevelSumOfBinaryTree {
    public int maxLevelSum(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addLast(root);
        int tempMax = root.val;
        int level = 0;
        int answer = 1;
        while (!deque.isEmpty()) {
            int levelMax = 0;
            level++;
            int levelLength = deque.size();
            for (int i = 0; i < levelLength; i++) {
                TreeNode node = deque.pollFirst();
                levelMax += node.val;
                if (node.left != null) {
                    deque.addLast(node.left);
                }
                if (node.right != null) {
                    deque.addLast(node.right);
                }
            }
            if (levelMax > tempMax) {
                tempMax = levelMax;
                answer = level;
            }
        }

        return answer;
    }
}
