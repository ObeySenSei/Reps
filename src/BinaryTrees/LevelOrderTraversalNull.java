package BinaryTrees;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalNull {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static int idx = -1;

    public static Node buildTree(int[] preorder) {         ///  Build Binary Tree using Preorder

        idx++;

        if (preorder[idx] == -1) {
            return null;
        }

        Node root = new Node(preorder[idx]);

        root.left = buildTree(preorder);
        root.right = buildTree(preorder);

        return root;
    }

    // Level Order Traversal using Null Delimiter
    public static void levelOrder(Node root) {

        if (root == null) return;

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {

            Node curr = q.remove();

            if (curr == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }
                q.add(null);

            } else {
                System.out.print(curr.data + " ");

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] traversal = {1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1};

        Node root = buildTree(traversal);

        System.out.println("Level Order (Null Delimiter):");
        levelOrder(root);
    }
}