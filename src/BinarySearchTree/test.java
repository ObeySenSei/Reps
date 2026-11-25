package BinarySearchTree;


public class test {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
        }
    }
    public static boolean helper (TreeNode root, TreeNode min, TreeNode max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        if(max != null && root.data >= max.data){
            return false;
        }
        return helper(root.left, min,root) && helper(root.right, root, max);

    }
    public static boolean isValid (TreeNode root){
        return helper(root, null, null);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(1);
        root.right = new TreeNode(6);

        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(5);

        System.out.println(isValid(root));
    }
}


