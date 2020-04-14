public class Node{
  
  /* Find the height of a given binary tree.
             5
          3     7
        2  4  6   8 
  
  */
  Node left, right;
  int data;
  
  private static int height = 0;

  Node(int value){
    this.data = value;
  }
  
  private static int getHeight(Node root){
    if(root.left == null && root.right == null){
        return 0;
    }
    
    if(root.left != null){
      height = height + 1 + getHeight(root.left);
    } else {
      if(root.right != null){
        height = height + 1 + getHeight(root.right);
      }
    }
    
    return height;
    
    
  }

  public static void main(String[] args){
    Node tree5 = new Node(5);
    Node tree3 = new Node(3);
    Node tree7 = new Node(7);
    Node tree2 = new Node(2);
    Node tree4 = new Node(4);
    Node tree6 = new Node(6);
    Node tree8 = new Node(8);
    
    tree5.left = tree3;
    tree5.right = tree7;
    
    tree3.left = tree2;
    tree3.right = tree4;
    
    tree7.left = tree6;
    tree7.right = tree8;
    
    System.out.println(getHeight(tree5));
    
  }
  
}