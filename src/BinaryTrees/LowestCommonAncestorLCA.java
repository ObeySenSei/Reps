package BinaryTrees;

public class LowestCommonAncestorLCA {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {

        if (root == null || root == p || root == q) {        /// Base case
            return root;
        }

        Node left = lowestCommonAncestor(root.left, p, q);    /// Search in left subtree
        Node right = lowestCommonAncestor(root.right, p, q);  /// Search in right subtree

        if (left != null && right != null) {        /// If both sides return non-null, current node is LCA
            return root;
        }

        // Otherwise, return whichever side found a target
        if (left != null) {
            return left;
        }
        return right;

    }

    public static void main(String[] args) {

        /*
                    3
                  /   \
                 5     1
                / \   / \
               6   2 0   8
                  / \
                 7   4
        */

        // Creating the binary tree
        Node root = new Node(3);

        root.left = new Node(5);
        root.right = new Node(1);

        root.left.left = new Node(6);
        root.left.right = new Node(2);

        root.right.left = new Node(0);
        root.right.right = new Node(8);

        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);

        // Test Case 1: LCA of 5 and 8
        Node p1 = root.left;
        Node q1 = root.right.right;

        Node ans1 = lowestCommonAncestor(root, p1, q1);

        System.out.println("LCA of 5 and 8: " + ans1.data);


        // Test Case 2: LCA of 8 and 1
        Node p3 = root.right.right;
        Node q3 = root.right;

        Node ans3 = lowestCommonAncestor(root, p3, q3);
        System.out.println("LCA of 8 and 1: " + ans3.data);


        // Test Case 3: LCA of 6 and 4
        Node p4 = root.left.left;
        Node q4 = root.left.right.right;

        Node ans4 = lowestCommonAncestor(root, p4, q4);
        System.out.println("LCA of 6 and 4: " + ans4.data);
    }
}
