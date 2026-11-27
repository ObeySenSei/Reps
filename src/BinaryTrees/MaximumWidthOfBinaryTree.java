package BinaryTrees;
import java.util.*;

public class MaximumWidthOfBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    static class Pair {
        Node node;
        long index;

        Pair(Node node, long index) {
            this.node = node;
            this.index = index;
        }
    }

    public static int maxWidth(Node root) {

        if (root == null) {
            return 0;
        }

        LinkedList<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));             //  q = [(1, idx=0)]

        long maxWidth = 0;

        while (!q.isEmpty()) {                          // So initially currentSize is 1.

            int currLevelSize = q.size();               // currLevelSize = 1

            long startIdx = q.getFirst().index;         // For root node 1, startIdx = 0, endIdx = 0
            long endIdx = q.getLast().index;

            // Calculate current level width
            long width = endIdx - startIdx + 1;        // width = (0 - 0) + 1 = 1
            maxWidth = Math.max(maxWidth, width);      // maxWidth = max(0, 1) = 1

            for (int i = 0; i < currLevelSize; i++) {

                Pair current = q.poll();       // Remove the front Pair (1, 0)

                long idx = current.index;      // Get its index (0)

                // Left child
                if (current.node.left != null) {
                    q.add(new Pair(current.node.left, 2 * idx + 1));
                }

                // Right child
                if (current.node.right != null) {
                    q.add(new Pair(current.node.right, 2 * idx + 2));
                }
            }
        }
        return (int) maxWidth;
    }

    public static void main(String[] args) {
/*                 1          (idx = 0)
                  / \
                 3   2        (idx = 1, 2)
                / \   \
               5   3   9      (idx = 3, 4, [5 is missing], 6)  */

        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(9);
        System.out.println("Maximum Width: " + maxWidth(root));
    }
}
