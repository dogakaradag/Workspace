package Exam18-19;

public class 2b {
    void inorderTraversal(TreeNode<G> root){
        if(root == null) return;
        inorderTraversal(root.left);
        System.out.println(root.data);
        inorderTraversal(root.right);
    }
}
