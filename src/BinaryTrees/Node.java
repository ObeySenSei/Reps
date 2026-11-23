package BinaryTrees;

public class Node {

    int data;
    Node left;       // Reference to the left child
    Node right;      // Reference to the right child

    Node (int data){              // Constructor
        this.data = data;         // Assignment statement
        this.left = null;
        this.right = null;
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        inorder(root);
//        preorder(root);
//        postorder(root);

    }

    // Implementing inorder Traversal: Left -> Root -> Right
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    /// Preorder Traversal: Root -> Left -> Right
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    /// Postorder Traversal: Left -> Right -> Root
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
}
/**
 You're essentially defining the blueprint for every node in your Binary Tree.
 Each time you call new Node(value), Java creates a separate Node object.
 */