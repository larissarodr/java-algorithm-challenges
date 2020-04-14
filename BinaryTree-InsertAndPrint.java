/* Create method to insert a node in a Binary Tree and print the Tree. */

public class Node{
    
    Node right, left;
    int data;
    
    Node(int value){
        data = value;
    }
    
    private static Node insert(Node root, int data){
        if(data > root.data){
            //will be on the right
            if(root.right == null){
                root.right = new Node(data);
            } else {
                return insert(root.right, data);
            }
        } else {
            //will be on the left
            if(root.left == null){
                root.left = new Node(data);
            } else {
                return insert(root.left, data);
            }
        }
        return root;
    }
    
    private static void printTree(Node root){
        if(root.left != null){
            printTree(root.left);
        }
        System.out.println(root.data);
        if(root.right != null){
            printTree(root.right);
        }
    }
    
    public static void main(String[] args){
        Node tree = new Node(4);
        insert(tree, 5);
        insert(tree, 3);
        insert(tree, 2);
        
        printTree(tree);
    }
    
    
    
    
}