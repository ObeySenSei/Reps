package BinaryTrees;
import java.util.Queue;
import java.util.LinkedList;

public class LevelOrder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;       // We initialize left and right to null because a newly created node has no child nodes initially.
            this.right = null;      // Java automatically initializes object reference fields to null, so explicitly writing NULL is optional.
        }
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
              / \   \
             4   5   6
        */

        Node root = new Node(1);  // new Node(1) → Creates a new Node object with data = 1. Node root → Declares a reference variable called root that POINTS to that object.
        root.left = new Node(2);  // Again, new Node(2) creates a brand-new Node object.     root.left accesses the left reference of the existing root object.
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        System.out.println("Level Order Traversal: ");
        levelOrder(root);
    }
    // Level Order Traversal (BFS)
    public static void levelOrder(Node root) {    // Node → Data type   root → Parameter name (reference variable)
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();       ///  creates an empty queue []
        q.add(root);                             ///  q.add(root); → adds node 1 (front = 1, back = 1)

        while (!q.isEmpty()) {

            Node current = q.remove();
            System.out.print(current.data + " ");  // Print 1 first.

            if (current.left != null) {            // current = 1, so it means the node to the left of 1  (2 != null)
                q.add(current.left);               // So, q.add(2) → queue is [2]  Then again 4 != null → q.add(4) → queue is [3, 4]
            }

            if (current.right != null) {           // 3 != null → q.add(3) → queue is [2, 3]  Again, (5 != null) → q.add(5) → queue is [3, 4, 5]
                q.add(current.right);
            }
        }
    }
}


/**

 Node root = new Node(1);
 This does two things:
   new Node(1) → Creates a new Node object with data = 1.
   Node root → Declares a reference variable called root that points to that object.

 */