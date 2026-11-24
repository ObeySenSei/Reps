package BinaryTrees;
import java.util.LinkedList;
import java.util.Queue;

public class test {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args){
             /*
                 1
                / \
               2   3
              / \   \
             4   5   6
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);

        leveOrder(root);
    }
    public static void leveOrder(Node root){
        if (root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node current = q.remove();
            System.out.print(current.data + " ");

            if(current.left != null){
                q.add(current.left);
            }
            if(current.left != null){
                q.add(current.right);
            }
        }
    }
}
