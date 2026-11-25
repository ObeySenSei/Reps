package BinaryTrees;       ///  Manual Construction of Binary Tree. Here we are manually specifying where each node goes.

public class ManualConstructionBinaryTree {

    int data;
    ManualConstructionBinaryTree left;       // Reference to the left child
    ManualConstructionBinaryTree right;      // Reference to the right child

    ManualConstructionBinaryTree(int data){              // Constructor
        this.data = data;         // Assignment statement
        this.left = null;
        this.right = null;
    }

    public static void main(String[] args) {
        ManualConstructionBinaryTree root = new ManualConstructionBinaryTree(1);

        root.left = new ManualConstructionBinaryTree(2);
        root.right = new ManualConstructionBinaryTree(3);

        root.left.left = new ManualConstructionBinaryTree(4);
        root.left.right = new ManualConstructionBinaryTree(5);

        root.right.left = new ManualConstructionBinaryTree(6);
        root.right.right = new ManualConstructionBinaryTree(7);

        inorder(root);
//        preorder(root);
//        postorder(root);

    }

    // Implementing inorder Traversal: Left -> Root -> Right
    public static void inorder(ManualConstructionBinaryTree root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.println(root.data);    // Prints #1 the Root Node
        inorder(root.right);
    }

    /// Preorder Traversal: Root -> Left -> Right
    public static void preorder(ManualConstructionBinaryTree root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data);   // Prints #1 the Root Node
        preorder(root.left);
        preorder(root.right);
    }

    /// Postorder Traversal: Left -> Right -> Root
    public static void postorder(ManualConstructionBinaryTree root) {
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