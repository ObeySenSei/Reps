package BinaryTrees;    /// Here, we're NOT manually specifying where each node goes.

public class BinaryTree {

    static int idx = -1;

    // Node class
    static class Node {
        int data;
        Node left;
        Node right;

        // Constructor
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Build Binary Tree using Preorder
    public static Node buildTree(int[] preorder) {

        idx++;

        // Base condition
        if (preorder[idx] == -1) {
            return null;
        }

        // Create a new node
        Node root = new Node(preorder[idx]);

        // Recursively construct left and right subtrees
        root.left = buildTree(preorder);    // LEFT
        root.right = buildTree(preorder);   // RIGHT

        return root;
    }

    public static void main(String[] args) {

        int[] preorder = {
                1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1
        };

        Node root = buildTree(preorder);

        System.out.println("Binary Tree constructed successfully!");
    }
}
