package BinarySearchTree;

public class ValidateBST {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Helper function
    public static boolean helper(TreeNode root, TreeNode min, TreeNode max) {

        // Base case
        if (root == null) {
            return true;
        }

        // Check minimum boundary
        if (min != null && root.val <= min.val) {
            return false;
        }

        // Check maximum boundary
        if (max != null && root.val >= max.val) {
            return false;
        }

        // Recursively validate left and right subtrees
        return helper(root.left, min, root)
                && helper(root.right, root, max);
    }

    // Main validation function
    public static boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(8);

        root.left = new TreeNode(5);
        root.right = new TreeNode(10);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(9);

        System.out.println(isValidBST(root));
    }
}
