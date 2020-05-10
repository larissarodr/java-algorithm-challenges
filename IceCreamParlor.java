/*Sunny and Johnny like to pool their money and go to the ice cream parlor. 
Johnny never buys the same flavor that Sunny does. The only other rule they 
have is that they spend all of their money.
Given a list of prices for the flavors of ice cream, select the two that will 
cost all of the money they have.*/

class Solution{
  
  public static void main(String[] args){
    
    int[] cost = {3,2,1,5,6};
    int money = 6;
    
    int[] posOfPrices = iceCreamParlor(cost, money);
    for(int i = 0 ; i < posOfPrices.length ; i ++){
      System.out.println(posOfPrices[i]);
    }
    
  }
  
  private static int[] iceCreamParlor(int[] cost, int money){
    
    for(int i = 0 ; i < cost.length ; i++){
      
      for(int j = 0 ; j < cost.length ; j ++){
        if(j==i) continue;
        
        if(cost[i] + cost[j] == money){
          return new int[]{i + 1,j + 1};
        }
      }
      
    }
    return new int[] {0,0};
    
  }
  
}