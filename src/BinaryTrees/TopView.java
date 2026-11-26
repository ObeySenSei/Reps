package BinaryTrees;
import java.util.*;

public class TopView {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void topView(Node root) {

        Queue<Node> queue = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();   /// tree should be TreeMap <Integer,Integer> because you want HD as the key and node data as the value.

        HashMap<Node, Integer> hdMap = new HashMap<>();   /// Store horizontal distance of each node. Should be HashMap< Node,Integer> because you're storing a node as the key and its HD as the value.

        queue.add(root);          // Say   1
        hdMap.put(root, 0);       // Say (1,0)

        while (!queue.isEmpty()) {

            Node current = queue.poll();
            int hd = hdMap.get(current);    // fetches the horizontal distance

            // Store only the first node at each HD...If my map does not contain that key, Insert it.
            if (!map.containsKey(hd)) {
                map.put(hd, current.data);               // map.put (0,1)
            }

            if (current.left != null) {        // 1.left (2) is not null → queue.add(2), hdMap.put(2, -1)
                queue.add(current.left);
                hdMap.put(current.left, hd - 1);
            }

            if (current.right != null) {      // 1.right (3) is not null → queue.add(3), hdMap.put(3, 1)
                queue.add(current.right);
                hdMap.put(current.right, hd + 1);
            }
        }

        // Print from left to right
        for (int value : map.values()) {
            System.out.print(value + " ");
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
/**
 map.values() is a Java Map method that returns a Collection view of all the values stored inside map
 (a TreeMap<Integer, Integer>), without their keys.


 TreeMap is an ordered map in Java. More specifically, TreeMap stores its key-value pairs in sorted order of keys, not insertion order.
 Why did we use it?
 Because horizontal distances might be inserted in any order, but we need to print them from leftmost to rightmost.
 TreeMap automatically sorts the horizontal distance keys for us. That's exactly where its ordered nature becomes useful.


 */
