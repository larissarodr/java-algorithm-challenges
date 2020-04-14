/* Insert a node in a specific position of a Linked List. */
class LinkedList{
    
    static Node head;
    
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    private static void insertInNode(int value, int position){
        if(head == null){
            Node newNode = new Node(value);
            head = newNode;
            return;
        }
        
        if(position == 0){
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
            return;
        }
        
        if(head.next == null){
            Node newNode = new Node(value);
            head.next = newNode;
            return;
        }
        
        
        Node current = head;
        int count = 0;
        while(current.next != null){
            System.out.println("here");
            if(position - 1 == count){
                Node newNode = new Node(value);
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            count++;
            current = current.next;
        }
        
    }
    
    private static void printList(){
        Node current = head;
        
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    
    public static void main(String[] args){
        
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        insertInNode(4, 2);
        printList();
        
    }
    
}