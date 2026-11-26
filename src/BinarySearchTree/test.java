package BinarySearchTree;

public class test {
    static class TreeNode{
        int data;
        TreeNode right,left;

        TreeNode(int data){
            this.data = data;
        }
    }
    public static void InOrder(TreeNode root){

        TreeNode current = root;  // We create a current variable of Treenode data type will the value as same as root

        while(current != null){

            if(current.left == null){
                System.out.println(current.data + " ");
                current = current.right;
            }
            else {
                TreeNode predecessor = current.left;

                while(predecessor.right != null && predecessor.right!= current){
                    predecessor = predecessor.right;            // Find the predecessor
                }
                if (predecessor.right == null){
                    predecessor.right = current;                // Establish the connection
                    current = current.left;
                }
                else {
                    predecessor.right = null;
                    current = current.left;
                }
            }

        }
    }



    public static void main(String[] args) {

        // Creating our binary tree
        //
        //          1
        //         / \
        //        2   3
        //       / \
        //      4   5

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);


        System.out.println("Morris Inorder Traversal:");
    }
}
