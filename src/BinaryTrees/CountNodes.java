package BinaryTrees;

public class CountNodes {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int countNodes(Node root) {

        // Base case: Empty tree has 0 nodes
        if (root == null) {
            return 0;
        }

        // Count current node + left subtree + right subtree
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);

        return 1 + leftNodes + rightNodes;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Total Nodes: " + countNodes(root));
    }
}
/**

 leftCount: Total nodes in the left subtree.
 rightCount: Total nodes in the right subtree.
 1: The current root node.


 So a leaf node (like 4, 5, 6, 7) has no left or right people under it:
 leftNodes = 0
 rightNodes = 0
 Total for that leaf = 1 + 0 + 0 = 1 (just itself).

Watching the Numbers Roll Up
 Plaintext
      1              <-- 1 + 3 + 3 = 7 total
    /  \
   2    3            <-- Node 2: 1+1+1 = 3 | Node 3: 1+1+1 = 3
  / \  / \
 4  5  6  7          <-- Each leaf: 1 + 0 + 0 = 1


 Leaves 4, 5, 6, 7 each report 1 back up.
 Node 2 gets 1 from left and 1 from right, counts itself (+1), and reports 3 to Node 1.
 Node 3 gets 1 from left and 1 from right, counts itself (+1), and reports 3 to Node 1.
 Node 1 adds its own 1 + 3 + 3 = 7.

 How to Read Any Tree Recursion Like a Human
 Trust the function on smaller pieces—do not try to trace 20 calls in your head at once.

 Ask one question at a single node: "If my left side gives me X and my right side gives me Y, what do I pass back up?"
 Check the empty stop sign (null) so you know where the counting stops and returns 0 (or true in ValidateBST).
 */