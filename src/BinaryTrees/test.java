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
    public static int transform(Node root){
        if (root == null) return 0;

        int calLeft = transform(root.left);
        int calRight = transform(root.right);

        int store = root.data;
        root.data = store + calLeft + calRight;
        return root.data;
    }
    public static void printPreOrder(Node root) {
        if (root == null) return ;
        System.out.print(root.data + " ");
        printPreOrder(root.right);
        printPreOrder(root.left);
    }


    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print(transform(root));

        System.out.println("Transformed Sum Tree:");
        printPreOrder(root);
    }
}

