package BinaryTrees;

public class SumTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }

    public static int transform(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = transform(root.left);      // Recursive calls to get the values of both left and right subtrees from a current root.
        int rightSum = transform(root.right);

        int originalValue = root.data;          //  We first preserve the original node value because we are about to overwrite it.
        root.data = originalValue + leftSum + rightSum;         //  Updates root.data = leftSum + rightSum (the sum of all nodes strictly below root).

        return root.data;
    }
    /// Using preorder traversal to display the transformed tree:
    public static void preorder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {

        /*        1
                /   \
              2      3
             / \    /  \
            4   5  6    7
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(transform(root));        // Gives us the cumulative Sum.

        System.out.println("Transformed Sum Tree:");
        preorder(root);
    }
}
/*
We 're already changing the actual nodes of the tree!
root.data = leftSum + rightSum;
Because root is a reference to the actual node object, modifying root.data directly updates the original tree.
 */