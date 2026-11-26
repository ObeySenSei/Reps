package BinarySearchTree;

import org.w3c.dom.Node;

public class test {
    static class TreeNode{
        int data;
        TreeNode right,left;

        TreeNode(int data){
            this.data = data;
        }
    }
    public static boolean check (TreeNode p, TreeNode q){
        if (p==null || q==null){
            return p==q;
        }
        boolean checkLeft = check(p.left, q.left);
        boolean checkRight= check(p.right, q.right);

        return checkLeft && checkRight && p.data == q.data;
    }


    public static void main(String[] args) {

        // First tree
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);


        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(4);

        System.out.println("Are both trees identical? " + check(p, q));
    }

}
