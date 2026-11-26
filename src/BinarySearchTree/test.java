package BinarySearchTree;

public class test {
    static class Node{
        int data;
        Node right,left;

        Node(int data){
            this.data = data;
        }
    }
    static int ans = 0;   /// Every class can access its data, global variable.

    public static int calculateHeight(Node root){
        if(root==null){
            return 0;
        }
        int leftheight = calculateHeight(root.left);
        int righthight = calculateHeight(root.right);
        ans = Math.max(ans, leftheight + righthight);          // diameter...for 1 node

        return 1 + Math.max(leftheight,righthight);
    }
    public static int calculateDiameter(Node root){
        if(root==null) return 0;
        calculateHeight(root);
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.left = new Node(4);

        root.left.right = new Node(5);
        root.right= new Node(7);
        root.right.left= new Node(8);

        System.out.println(calculateDiameter(root));

    }

}
