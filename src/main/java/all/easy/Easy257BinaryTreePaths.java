package all.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Easy257BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            return Collections.emptyList();
        }
        List<String> answer = new ArrayList<>();
        String pStart = String.valueOf(root.val);
        traversal(pStart, root, answer);
        return answer;
    }

    public void traversal(String path, TreeNode node, List<String> answer){
        if(node.right == null && node.left == null){
            answer.add(path);
            return;
        }
        if(node.left != null){
            String p1 = path + "->" + node.left.val;
            traversal(p1, node.left, answer);
        }
        if(node.right != null){
            String p2 = path + "->" + node.right.val;
            traversal(p2, node.right, answer);
        }

    }
}
