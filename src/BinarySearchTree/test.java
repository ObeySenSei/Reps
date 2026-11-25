package BinarySearchTree;

public class test {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static int findHeight(Node root){
        if (root==null) return 0;

        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1 ;
    }
    public static int diameter(Node root){
        if (root==null) return 0;

        int leftd = diameter(root.left);
        int rightd = diameter(root.right);
        int currentD = findHeight(root.left) + findHeight(root.right);

        return Math.max(currentD, Math.max(leftd,rightd));
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.right = new Node(2);
        root.left = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.left.left.left = new Node(6);

        System.out.println(findHeight(root));
    }
}