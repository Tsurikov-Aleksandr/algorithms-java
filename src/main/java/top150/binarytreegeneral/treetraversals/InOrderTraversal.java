package top150.binarytreegeneral.treetraversals;

public class InOrderTraversal {
    // Left -> Value -> Rigth
    public void inOrderTraversal(TreeNode root) {
        //Terminating condition
        if (root == null) {
            return;
        }
        //traverse the left node
        inOrderTraversal(root.left);
        //print the root node
        System.out.println(root.val + "->");
        //traverse the rigth node
        inOrderTraversal(root.right);

    }
}
