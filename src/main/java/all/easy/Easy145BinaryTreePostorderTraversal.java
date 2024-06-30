package all.easy;

import java.util.ArrayList;
import java.util.List;

public class Easy145BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if(root ==null){
            return  answer;
        }
        DSF(answer, root);
        return answer;
    }

    private void DSF(List<Integer> ansewr, TreeNode node){
        if(node == null){
            return;
        }
        DSF(ansewr, node.left);
        DSF(ansewr, node.right);
        ansewr.add(node.val);
    }
}
