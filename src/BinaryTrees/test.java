package BinaryTrees;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public  class test {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void topView(Node root) {
        Queue<Node> q = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        HashMap<Node, Integer> hdmap = new HashMap<>();

        q.add(root);
        hdmap.put(root, 0);

        while (!q.isEmpty()){
            Node current = q.poll();
            int hd = hdmap.get(current);

            if(!hdmap.containsKey(hd)){
                map.put(hd, current.data );
            }
            if(current.left != null){
                q.add (current.left);
                hdmap.put(current.left,hd-1 );
            }
            if(current.right != null){
                q.add (current.right);
                hdmap.put(current.right,hd + 1);
            }
            for(int value : map.values()){
                System.out.println(value + " ");
            }

        }
    }

    public static void main(String[] args) {

        //       1
        //      / \
        //     2   3
        //    / \ / \
        //   4  5 6  7

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topView(root);
    }
}
