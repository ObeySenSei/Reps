package BinaryTrees;
/// Here, we're NOT manually specifying where each node goes. Instead, the program figures out the structure using the preorder array.

public class BinaryTree {
    public static void main(String[] args) {

        int[] preorder = {1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1};
        Node root = buildTree(preorder);

        System.out.println("Binary Tree constructed successfully!");
        System.out.print("Inorder: ");
        inorder(root);

        System.out.println();
        System.out.print("Preorder: ");
        preorder(root);

        System.out.println();

        System.out.print("Postorder: ");
        postorder(root);

        System.out.println();
    }
    static int idx = -1;        ///  Maintains the index across recursive calls.  static → Belongs to the class rather than individual objects.  Initial value is -1.

    // Node class
    static class Node {        // Nested class
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

        idx++;                            ///  Every time buildTree() is called, idx advances to the next array element.

        if (preorder[idx] == -1) {       /// Base condition
            return null;
        }

        // Create a new node
        Node root = new Node(preorder[idx]);             ///  Java reference to a Node object ... Creates a Node object on the heap.

        // Recursively construct left and right subtrees
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

        if (root == null) {
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
}
