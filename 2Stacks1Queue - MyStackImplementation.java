/* Implement a queue with 2 stacks. Your queue should have an enqueue and 
a dequeue method and it should be "first in first out" (FIFO).
These can be any mix of enqueue and dequeue calls. */


//FIFO
class Queue{  
  
 /*
  S1
  1 2 3
  S2
  6 5 
 
  enqueue: add to S1
  dequeue: pop from S2. if S2 is empty, I transfer everything from S1 to S2 (by popping from S1, and pushing into S2)
  print: if S2 is empty, copy from S1 to S2 and return S2.top
 
 */
  
  Stack s1, s2;
  
  Queue(){
    s1 = new Stack();
    s2 = new Stack();
  }
  
  class Stack{
    int top;
    int[] stack;
    
    Stack(){
      top = 0;
      stack = new int[100000];
    }
    
    private void push(int x){
      stack[top] = x;
      top ++;
    }
    
    private int pop(){
      int value = stack[top - 1];
      stack[top -1] = 0;
      top--;
      return value;
    }
    
    private int peek(int pos){
      return stack[pos];
    }
    
    private int top(){
      return peek(top - 1);
    }
    
    private boolean isEmpty(){
      return top <= 0;
    }
    private void print(){
        for(int i = 0 ; i < top ; i ++){
            System.out.println(stack[i]);
        }
    }
  }
  
  private void enqueue(int x){
    s1.push(x);
  }
  
  private int dequeue(){
    
    if(s2.isEmpty() && s1.isEmpty()) {
      System.out.println("Error. Queue is Empty.");
      return 999;
    }
    
    if(s2.isEmpty()){
      while(!s1.isEmpty()){
        int value = s1.pop();
        s2.push(value);
      }
    }
    int popped = s2.pop();
    return popped;
    
  }
  
  private void printFirstInQueue(){
      
    if(s2.isEmpty() && s1.isEmpty()) {
      System.out.println("Error. Queue is Empty.");
      return;
    }
    
    if(s2.isEmpty()){
      while(!s1.isEmpty()){
        int value = s1.pop();
        s2.push(value);
      }
    }
    System.out.println(s2.top());
  }
    
  public static void main(String[] args){
    Queue q = new Queue();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.dequeue(); //1
    q.dequeue(); //2
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.dequeue(); //3
    
    q.printFirstInQueue(); // should print 1
  }
  
}
