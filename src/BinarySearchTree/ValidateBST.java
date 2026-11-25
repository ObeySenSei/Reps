package BinarySearchTree;

public class ValidateBST {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static boolean helper(TreeNode root, TreeNode min, TreeNode max) {      ///  Helper function

        if (root == null) {     // Base case of recursion
            return true;
        }

        if (min != null && root.data <= min.data) {     // if there exists a boundary and the value of the current node is less than or equal to that data, BST is Invalid.
            return false;
        }

        if (max != null && root.data >= max.data) {   // Check maximum boundary
            return false;
        }

        /// Recursively validate left and right subtrees
        return  helper(root.left, min, root)           // root.left calls the left tree recursively
                && helper(root.right, root, max);      // root.right calls the right tree recursively
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

/**

 min != null , checks whether a minimum boundary has been established.
 root.data <= min.data — checks whether the current node is smaller than or equal to that boundary.
 If both conditions are true, the BST is invalid.


 */