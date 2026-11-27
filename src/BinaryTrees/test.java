package BinaryTrees;

public  class test {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    static int maxSum = Integer.MIN_VALUE;

    public static int currentSum(Node root){
        if(root == null) return 0;

        int leftSum = Math.max(0,currentSum(root.left));
        int rightSum = Math.max(0,currentSum(root.right));
        int currentPathSum = root.data + leftSum + rightSum;

        maxSum = Math.max(maxSum,currentPathSum);
        return root.data + Math.max(leftSum,rightSum);   // Return this to the parent node to avoid a Branch.
    }
    public static int maxPath(Node root){
        currentSum(root);
        return maxSum;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.right = new Node(6);

        System.out.println("Max Path Sum: " + maxPath(root));


    }
}



