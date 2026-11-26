package BinarySearchTree;

public class IdenticalTree {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static boolean check(TreeNode p, TreeNode q) {

        if (p == null || q == null) {                           /// Base case: if either node is null....if both p and q are not null, that is they contain some values. Then the condition is skipped entirely.
            return p == q;
        }

        boolean isLeftSame = check(p.left, q.left);       /// Recursively compare left subtrees
        boolean isRightSame = check(p.right, q.right);    /// Recursively compare right subtrees

        return isLeftSame && isRightSame && p.data == q.data;   /// Compare both subtrees (STRUCTURE OF BOTH LEFT AND RIGHT) and current node values
    }

    public static void main(String[] args) {

        // First tree
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        // Second tree
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        System.out.println("Are both trees identical? " + check(p, q));
    }
}
/**

  if (p == null || q == null) {
     return p == q;
  Say   p = null;
        q = null;

 - p == null → true
 - q == null → true
 - p == q → true
 Both trees have reached an empty position. Their structures match at this position.

 Interview explanation:
 If both nodes exist, recursively compare their left and right subtrees and verify that their current node values match.


 */