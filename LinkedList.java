/*Create functions to append, preprend and delete from a Linked List.*/

class LinkedList{
 
  Node head;

  private class Node{

    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }

  }  
  
  private void append(int data){
    if(head == null){
      head = new Node(data);
      return;
    }
    Node current = head;
    
    while(current.next != null){
      current = current.next;
    }
    
    current.next = new Node(data);
  }
  
  private void prepend(int data){
    if(head == null){
      head = new Node(data);
      return;
    }
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }

  private void delete(int data){
    if(head == null){
      return;
    }
    
    if(head.data == data){
      head = head.next;
      return;
    }
    
    Node current = head;
    while(current.next != null){
      if(current.next.data == data){
        current.next = current.next.next;
        return;
      }
      current = current.next;
    }
  }
  
  private static void print(Node head){
    Node current = head;
    while (current != null){
      System.out.println(current.data);
      current = current.next;
    }
    
  }


  public static void main(String[] args){
   LinkedList list = new LinkedList();
   list.append(1);
    print(list.head);
    System.out.println("--------------");
   list.append(5);
    print(list.head);
    System.out.println("--------------");
   list.append(4);
   print(list.head);
   System.out.println("--------------");
   list.prepend(2);
    print(list.head);
    System.out.println("--------------");
   list.prepend(3);
    print(list.head);
    System.out.println("--------------");
   list.delete(1);
    print(list.head);
    System.out.println("--------------");
  }
  
}