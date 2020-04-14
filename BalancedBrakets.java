/*Given an expression string exp , write a program to examine whether the 
pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.*/

class Solution{
  
  public static void main (String[] args) {
    /*
    {[()]} -- true
    {[(])} -- false
    {{[[(())]]}} -- true */
    String s1 = "({{[[(())]]}}";
    System.out.println(isBalanced(s1));
    
  }
  
  private static boolean isBalanced(String s){
    
    char[] arr = s.toCharArray();
    Stack<Character> stack = new Stack<Character>();
    
    for(int i = 0 ; i < arr.length ; i++){
      
      if((arr[i] == '(' )||
         (arr[i] == '[' )||
         (arr[i] == '{')){
            stack.push(arr[i]);
      } else {
        char popped = stack.pop();
        
        if((arr[i] == ')' && popped != '(')
           || (arr[i] == ']' && popped != '[') 
           || (arr[i] == '}' && popped != '{')){
          return false;
        }
      }
      
    }
    if(!stack.isEmpty()){
      return false;
    }
    
    return true;
    
  }

}