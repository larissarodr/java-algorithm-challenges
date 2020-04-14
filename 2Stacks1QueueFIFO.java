/* Implement a queue with 2 stacks. Your queue should have an enqueue and 
a dequeue method and it should be "first in first out" (FIFO).
These can be any mix of enqueue and dequeue calls. */

class Solution {
  
    static class Queue{
      Stack<Integer> stack1 = new Stack<Integer>();
      Stack<Integer> stack2 = new Stack<Integer>();
    
  
      private void enqueue(int x){
        System.out.println("-------------------------------------------" + x);
        if(stack1.isEmpty() && stack2.isEmpty()){
          System.out.println("first element here");
           stack1.push(x);
           return;
        }
        while(!stack1.isEmpty()){
          int value = stack1.pop();
          stack2.push(value);
          System.out.println("popping to stack2" + value);
        }
        stack1.push(x);
        System.out.println("just pushed");
        while(!stack2.isEmpty()){
          int value = stack2.pop();
          stack1.push(value);
          System.out.println("popping them all back to stack1" + value);
        }
        System.out.println("-------------------------------------------");
      }

      private int dequeue(){
        return stack1.pop();
      }
    }
  
    public static void main(String[] args) 
    { 
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(2);
        q.enqueue(8);
        q.enqueue(7);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
    }  
  
}
