package BinarySearchTree;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }
}

public class MorrisInorderTraversal {
    public static void morrisInorder(TreeNode root) {

        TreeNode current = root;  // This creates a reference variable called current that initially points to the root node of our binary tree.

        while (current != null) {              // Root node cannot be empty

            if (current.left == null) {         /// Case 1: if Current node has no left child just Print

                System.out.print(current.data + " ");
                current = current.right;       /// move the current reference to the right child of the current node.
            }

            else {

                TreeNode predecessor = current.left;    // Find the inorder predecessor  (current.left is 2)

                while (predecessor.right != null && predecessor.right != current) {
                    // Predecessor is 2 and right of 2 is 5. So 2.right != null and has value 5 and  5 != 1.

                    predecessor = predecessor.right;      // predecessor = 5
                }

                // Case 2: Create a temporary thread
                if (predecessor.right == null) {         // If right of 5 is Null,

                    predecessor.right = current;         // establish the link/thread  i.e   5.right = 1
                    current = current.left;              // 1 =   1.left   which is   2.
                }

                // Case 3: Remove the temporary thread
                else {                                // The second else executes when we return to a node whose left subtree has already been traversed.
                    //Then we moved left to 2. Later, when current = 2, we created: 4.right = 2, After printing 4, the temporary thread brought us back to 2.
                    predecessor.right = null;     // Remove temporary thread (4.right = null)

                    System.out.print(current.data + " "); // Print 2
                    current = current.right;              // Move to 5 (actual right child of 2)
                }
            }
        }
    }

    public static void main(String[] args) {

        // Creating our binary tree
        //
        //          1
        //         / \
        //        2   3
        //       / \
        //      4   5

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Morris Inorder Traversal
        System.out.println("Morris Inorder Traversal:");

        morrisInorder(root);
    }
}
