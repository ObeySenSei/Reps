package BinaryTrees;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalLineWise {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static int idx = -1;                                 // Maintains index across recursive calls

    public static Node buildTree(int[] preorder) {       // Build Binary Tree using Preorder

        idx++;

        if (preorder[idx] == -1) {
            return null;
        }

        Node root = new Node(preorder[idx]);

        root.left = buildTree(preorder);
        root.right = buildTree(preorder);

        return root;
    }

    // Level Order Traversal (Line Wise)
    public static void levelOrder(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node curr = q.remove();
                System.out.print(curr.data + " ");

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] traversal = {
                1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1};

        Node result = buildTree(traversal);

        System.out.println("\n\nLevel Order (Line Wise):");
        levelOrder(result);
    }
}


