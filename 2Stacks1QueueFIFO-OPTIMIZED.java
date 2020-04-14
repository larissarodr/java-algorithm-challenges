/* Implement a queue with 2 stacks. Your queue should have an enqueue and 
a dequeue method and it should be "first in first out" (FIFO).
These can be any mix of enqueue and dequeue calls. */

class Solution {
  
    static class Queue{
      Stack<Integer> stack1 = new Stack<Integer>();
      Stack<Integer> stack2 = new Stack<Integer>();
    
  
      private int enqueue(int x){
        return stack1.push(x);
      }

      private int dequeue(){
        if(stack1.isEmpty() && stack2.isEmpty()){
          System.out.println("Error, both stacks are empty.");
          return 999;
        }
        
        if(stack2.isEmpty()){
          while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
          }
        }
        return stack2.pop();
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
