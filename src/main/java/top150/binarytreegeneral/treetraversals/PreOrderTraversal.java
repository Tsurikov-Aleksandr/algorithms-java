package top150.binarytreegeneral.treetraversals;

public class PreOrderTraversal {
     // Value -> Left -> Rigth
    public void preOrderTraversal(TreeNode root) {
        //Terminating condition
        if (root == null) {
            return;
        }
        //print the root node
        System.out.println(root.val + "->");
        //traverse the left node
        preOrderTraversal(root.left);
        //traverse the rigth node
        preOrderTraversal(root.right);

    }
}
