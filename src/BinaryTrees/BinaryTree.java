package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

/// Here, we're NOT manually specifying where each node goes. Instead, the program figures out the structure using the preorder array.

public class BinaryTree {
    static class Node {            // Node class  with instance variables
        int data;
        Node left;
        Node right;

        Node(int data) {           // Constructor
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static int index = -1;        ///  Maintains the index across recursive calls.  We use this to keep track of our current position in the preorder array while recursively building the Binary Tree.  -1 Initial position before the first element.

    public static Node buildTree(int[] preorder) {
        index++;                            ///  Every time buildTree() is called, idx advances to the next array element.

        if (preorder[index] == -1) {       /// Our Base condition for recursion
            return null;
        }

        Node root = new Node(preorder[index]);             // Creates a Node object on the heap.

        /// Recursively construct left and right subtrees
        root.left = buildTree(preorder);
        root.right = buildTree(preorder);
        return root;
    }

    ///  Inorder: Left -> Root -> Right
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    ///  Preorder: Root -> Left -> Right
    public static void preorder(Node root) {

        if (root == null) {                       // If a current node has no sub-child, just return.
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    ///  Postorder: Left -> Right -> Root
    public static void postorder(Node root) {

        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        int[] preorder = {1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1};  // I used preorder because the input array represents a preorder traversal of the tree.
        Node result = buildTree(preorder);

        System.out.println("Binary Tree constructed successfully!");
        System.out.print("Inorder: ");
        inorder(result);

        System.out.println();
        System.out.print("Preorder: ");
        preorder(result);
        System.out.println();

        System.out.print("Postorder: ");
        postorder(result);
    }

}

/**

 As the recursive call encounters -1, what gets assigned to root.left?
 B. null gets assigned to root.left.
 null gets assigned to root.left because your recursive method explicitly returns null when it encounters -1.

 */