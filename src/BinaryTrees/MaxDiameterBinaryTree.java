package BinaryTrees;

public class MaxDiameterBinaryTree {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    static int ans = 0;

    public static int height(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftHt = height(root.left);         ///  Calculate left and right subtree heights
        int rightHt = height(root.right);

        ans = Math.max(ans, leftHt + rightHt);      ///  Update maximum diameter

        return Math.max(leftHt, rightHt) + 1;       ///  Return height of current node
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return ans;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.left.left.left = new TreeNode(6);

        System.out.println(diameterOfBinaryTree(root));
    }
}

/**

 Why not directly return height(root)?
 Because height() returns the height of the tree, NOT its diameter.

 Remember:
 - height() → calculates height and updates ans.
 - diameterOfBinaryTree() → returns the final diameter.
 */
