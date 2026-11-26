package BinarySearchTree;

public class IdenticalSubTree {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static boolean isIdentical(TreeNode p, TreeNode q) {         ///  Check whether two trees are identical
        if (p == null || q == null) {
            return p == q;
        }

        boolean isLeftSame = isIdentical(p.left, q.left);        /// Recursively compare left and right subtrees
        boolean isRightSame = isIdentical(p.right, q.right);

        return isLeftSame && isRightSame && p.data == q.data;        /// Compare current node values
    }

    // Check whether subRoot exists inside root
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (subRoot == null) {        // An empty tree is always a subtree
            return true;
        }

        if (root == null) {          // A non-empty tree cannot exist inside an empty tree
            return false;
        }

        /// Check whether the entire tree starting from the current root node is identical to subRoot.
        if (isIdentical(root, subRoot)) {
            return true;
        }

        // Search in left and right subtrees
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {

        // Main tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Subtree to search
        TreeNode subRoot = new TreeNode(2);
        subRoot.left = new TreeNode(4);
        subRoot.right = new TreeNode(5);

        System.out.println("Is subRoot a subtree? " + isSubtree(root, subRoot));
    }
}
/**

 The most important thing to understand:
 - isSubtree() searches for a matching starting node.
 - isIdentical() verifies the entire tree from that starting node, including structure and values.

 if (isSameTree(root, subRoot)) {
 return true;

 Meaning: Check whether the entire tree starting from the current root node is identical to subRoot.
 Let's understand the execution.

 Main tree:
         1
       /  \
     2     3
   /        \
 4            5

 subRoot:
     2
   /   \
 4      5


 What happens?
 1. First, isSameTree(root, subRoot) compares nodes 1 and 2.
 2. They don't match, so it returns false.
 3. The algorithm searches the left subtree using isSubtree(root.left, subRoot).
 4. Now it compares nodes 2 and 2.
 5. isSameTree() recursively compares their left and right children.
 6. Both structures and all corresponding values match.


 */