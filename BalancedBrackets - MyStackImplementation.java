/*Given an expression string exp , write a program to examine whether the pairs
and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.*/

class MyStack{
  
  private static char[] arr;
  private static int top;
  
  MyStack(){
    arr = new char[1000];
    top = 0;
  }
  
  private void push(char c){
    arr[top] = c;
    top++;
  }
  
  private char pop(){
    char value = arr[top - 1];
    top--;
    return value;
  }
  
  private boolean isEmpty(){
    return (top <= 0);
  }
  
  private static boolean isOpeningBracket(char s){
    return (s == '(' || s == '[' || s == '{');
  }
  
  private static boolean isMatchingBracket(char s, char p){

    return ((s == '(' && p == ')') 
            || (s == '[' && p == ']') 
            || (s == '{' && p == '}'));
  }
  
  
  private static boolean isBalanced(String s1){
    
    char[] ch = s1.toCharArray();
    MyStack stack = new MyStack();
    
    for(int i = 0 ; i < ch.length ; i++){
      if(isOpeningBracket(ch[i])){
        //add to the stack
        stack.push(ch[i]);
      } else {
        //check if element on the top of the stack matches
        char p = stack.pop();
        
        if(!isMatchingBracket(p, ch[i])){
          return false;
        }  
      }
    }
    
    if(!stack.isEmpty()){
      return false;
    }
    
    return true;
    
  }
  
  public static void main (String[] args) {
   
    String s1 = "{{[[(())]]}}";
    System.out.println(isBalanced(s1));
    
  }


}