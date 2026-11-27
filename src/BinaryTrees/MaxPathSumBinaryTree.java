package BinaryTrees;

public class MaxPathSumBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }

    static int maxSum = Integer.MIN_VALUE;

    public static int maxPathSum(Node root) {         /// Initiates recursion and returns the global maximum.
        maxSum(root);                                 /// Makes one single call to maxGain(root) and waits for the entire recursive chain to finish before reading maxSum.
        return maxSum;
    }

    public static int maxSum(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = Math.max(0, maxSum(root.left));       // 0 helps us omit Negative values: Math.max(0, -6)
        int rightSum = Math.max(0, maxSum(root.right));
        int currentPathSum = root.data + leftSum + rightSum;     // A node can use both children to finish a path, but it can only pass one child contribution upwards to extend that path.

        maxSum = Math.max(maxSum, currentPathSum);
        return root.data + Math.max(leftSum, rightSum);          // Return current Node value + (only the best sum among its two subtrees) to the parent node to avoid a Branch.
    }

    public static void main(String[] args) {
        /*
                  -10
                  /  \
                 9    20
                     /  \
                    15   7
        */

        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println("Maximum Path Sum: " + maxPathSum(root));
    }
}
/**
 maxGain(root.left) runs first: It recursively calculates the maximum single-branch path sum starting from root.left (or returns 0 if root.left is null).
 Math.max(0, ...) prunes negative gains: If the left subtree's best downward path is negative (say -6), Math.max(0, -6) returns 0 instead.
 */