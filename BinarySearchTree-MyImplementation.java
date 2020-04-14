/*
	7
 3     8
2 4

2 3 4 7 8

*/

public class Node{
  
  Node left, right;
  int data;
  
  Node(int data){
    this.data = data;
  }
  
  private void insert(int value){
    
    if(value > data){
      //be on the right
      if(right == null){
        right = new Node(value);
      } else {
        right.insert(value);
      }
    } else {
      //be on the left
       if(left == null){
        left = new Node(value);
      } else {
        left.insert(value);
      }
    }
    
  }
  
  private boolean contains(int value){
     if(value == data){
         return true;
     }
     
    if(value > data){
      //its on the right side of the tree
      if(right == null){
        return false;
      } else {
        return right.contains(value);
      }
    } else {
      //its on the left
      if(left == null){
        return false;
      } else {
        return left.contains(value);
      }
    }
  }
  
  private void printInOrder(){
    //left - root node - right
    if(left != null){
      left.printInOrder();
    }
    System.out.println(data);
    if(right != null){
      right.printInOrder();
    }
  }
  
  public static void main (String[] args){
    Node tree = new Node(7);
    tree.insert(3);
    tree.insert(2);
    tree.insert(8);
    tree.insert(4);
    
    tree.printInOrder();
    
    System.out.println(tree.contains(7)); //true
    System.out.println(tree.contains(5)); //false
    
  }
  
  
}