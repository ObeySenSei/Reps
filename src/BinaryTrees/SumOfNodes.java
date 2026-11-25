package BinaryTrees;

public class SumOfNodes {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static int nodeSum(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = nodeSum(root.left);
        int rightSum = nodeSum(root.right);

        return  root.data + leftSum + rightSum ;
    }
    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height of the Binary Tree: " + nodeSum(root));
    }
}
