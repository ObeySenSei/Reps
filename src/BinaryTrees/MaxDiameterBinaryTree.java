package BinaryTrees;  /// Calculate height and update diameter in the same traversal → O(N).

public class MaxDiameterBinaryTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int ans = 0;                             ///  In this approach, we need to use an ANS variable to compare previous diameters of every node and return the max Ans.

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHt = height(root.left);         ///  Calculate left and right subtree heights
        int rightHt = height(root.right);

        ans = Math.max(ans, leftHt + rightHt);      ///  Update maximum diameter (Because the diameter passing through the current node is equal to the sum of the left and right subtree heights)

        return Math.max(leftHt, rightHt) + 1;       ///  We choose the max edge of either the left Subtree or Right and then add 1 to include itself
    }

    public static int diameterOfBinaryTree(Node root) {
        height(root);
        return ans;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.left.left.left = new Node(6);

        System.out.println(diameterOfBinaryTree(root));
    }
}

/**

 Why not directly return height(root)?
 Because height() returns the height of the tree, NOT its diameter.

 Remember:
 - height() → calculates height and updates ans.
 - diameterOfBinaryTree() → returns the final diameter.

 I use a recursive approach to calculate the height of the left and right subtrees.
 At each node, I calculate the current diameter by adding both subtree heights and update a global variable ans
 with the maximum diameter found so far. The height function returns the maximum subtree height +1 to account for the current node itself.

 Finally, I call the height function to initiate the recursive traversal, during which ans is continuously updated with the maximum diameter.
 Once the traversal is complete, I return ans as the final diameter.
 */
