package BinaryTrees;
public class KthLevelIncreasing {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    public static void KthLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        KthLevel(root.left, level + 1, k);
        KthLevel(root.right, level + 1, k);
    }

    public static void main(String[] args) {

        /*      1
               / \
              2   3
             / \ / \
            4  5 6  7
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        KthLevel(root, 1, 3);          ///  Print all nodes at level 2.  Currently, we at level 1.
    }
}
/*

Why to prefer Approach 2?
Because tracking the current level gives us more flexibility when solving other binary tree problems.

For example:
- Print nodes at a particular level.
- Find the maximum value at each level.
- Count nodes at each level.
- Find the sum of nodes at a particular level.
- Perform level-dependent operations.

 */
