package BinaryTrees;    ///  Reverse PreOrder Approach  using a NextRight (NR pointer) which stores our previously processed Node.

public class FlattenedBinaryTreeToLinkedList {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    static Node NR = null;

    public static void flatten(Node root) {
        if (root == null) {
            return;
        }

        flatten(root.right);       // Traverses right sub-tree. Reaches 6
        flatten(root.left);

        root.left = null;               // There's nothing to the 6's left pointer.
        root.right = NR;                // So we make 6's right pointer to null (initially NR = null)

        NR = root;                     // Then we update Null = 6.
    }
    public static void printList(Node root) {
        while (root != null) {
            System.out.print(root.data + " → ");
            root = root.right;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
/*                 1
                  / \
                 2   5
                / \   \
               3   4   6       */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.right = new Node(6);
        flatten(root);  // First modify/flatten the binary tree

        System.out.println("Linked List or Flattened Binary Tree in PreOrder: ");
        printList(root);  // Then we print the modified tree.
    }
}
