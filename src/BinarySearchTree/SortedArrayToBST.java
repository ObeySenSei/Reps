package BinarySearchTree;

public class SortedArrayToBST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }

    public static Node buildTree(int[] nums, int start, int end) {

        if (start > end) {                      // Base case
            return null;
        }

        int mid = start + (end - start) / 2;    // Find middle element
        Node root = new Node(nums[mid]);   // Create root node


        root.left = buildTree(nums, start, mid - 1);       // Build left subtree
        root.right = buildTree(nums, mid + 1, end);       // Build right subtree

        return root;
    }

    // Print tree using inorder traversal
    public static void inorder(Node root) {

        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};

        Node root = buildTree(nums, 0, nums.length - 1);

        System.out.println("Inorder Traversal:");
        inorder(root);
    }
}
