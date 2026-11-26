package BinaryTrees;

public class KthLevelDecreasing {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    public static void KthLevel(Node root, int k) {
        if (root == null) {
            return;
        }
        if (k == 1) {
            System.out.print(root.data + " ");       /// Once k == 1, it prints root.data and returns immediately without scanning deeper.
            return;
        }
        KthLevel(root.left, k - 1);    // Calls left child recursively, 2 - 1 = 1 next iteration.
        KthLevel(root.right, k - 1);   // Calls right child recursively, 2 - 1 = 1 next iteration. (does not visit 6 or 7)
    }

    public static void main(String[] args) {

        /*     1
              / \
             2   3
            / \ / \
           4  5 6  7  */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        KthLevel(root,2);           // Say we want to print all elements in  k = level 2.

    }
}
