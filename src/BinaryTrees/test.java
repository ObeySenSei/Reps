package BinaryTrees;


public class test {
    static class Node {
        int data;
        Node left ;
        Node right;      // HERE WE ARE CREATING INSTANCE VARIABLES

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static int index = -1;

    public static Node buildTree(int[] preorder){
        index++;
        
        if(preorder[index] == -1){   // If the current element in our preorder array is -1, then
            return null;
        }
        Node root = new Node(preorder[index]);  /// Then store that element

        root.left = buildTree(preorder);
        root.right = buildTree(preorder);
        return root;
    }
    public static void inOrder(Node root){
        if (root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static void preOrder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(Node root){
        if (root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        int[] preorder = {1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1};
        Node result = buildTree(preorder);

        System.out.println("Binary Tree constructed successfully!");
        System.out.print("Inorder: ");
        inOrder(result);
        System.out.println();

        System.out.print("PreOder: ");
        preOrder(result);
        System.out.println();

        System.out.print("PostOder: ");
        postOrder(result);
        System.out.println();


    }
}
