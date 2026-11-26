package BinaryTrees;  // Calculate height separately for every node → O(N²) worst case.

public class MaxDiameterBinaryTreeBruteForce {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    public static int height(Node root) {        ///  Calculate height for the Root Node where the diameter passes through its Root.
        if (root == null) {
            return 0;
        }

        int leftHt = height(root.left);
        int rightHt = height(root.right);

        return Math.max(leftHt, rightHt) + 1;      /// Why +1? Because we are calculating the height of the current node as well.
    }

    public static int diameter(Node root) {       /// Calculate diameter

        if (root == null) {
            return 0;
        }

        int leftDiam = diameter(root.left);             ///  Diameter that goes through left
        int rightDiam = diameter(root.right);           ///  Diameter that goes through right
        int currDiam = height(root.left) + height(root.right);
        /// We need to calculate the height to get the diameter that passes through the Main Root Node. No +1 because Diameter is measured in edges, not nodes.

        return Math.max(currDiam, Math.max(leftDiam, rightDiam));
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.left.left.left = new Node(6);

        System.out.println(diameter(root));
    }
}
/**

 Is this approach efficient?
 O(n²) worst case
 The problem is that height() repeatedly traverses the same nodes while calculating the diameter.

 For every node, we:
 - Calculate left diameter.
 - Calculate right diameter.
 - Recalculate left height.
 - Recalculate right height.
 This creates redundant work.

 The better approach: O(n)
 We can calculate height and diameter simultaneously using a single recursive traversal.
 That's the optimized approach commonly preferred in interviews.

 */
