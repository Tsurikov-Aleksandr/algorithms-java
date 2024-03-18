package top150.binarytreegeneral.treetraversals;

public class PostOrderTraversal {
     // Left -> Rigth -> Value
     public void postOrderTraversal(TreeNode root) {
         //Terminating condition
         if (root == null) {
             return;
         }
         //traverse the left node
         postOrderTraversal(root.left);
         //traverse the rigth node
         postOrderTraversal(root.right);
         //print the root node
         System.out.println(root.val + "->");
     }
}
