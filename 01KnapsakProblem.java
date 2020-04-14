import java.io.*;
import java.util.*;

/*
 * 0-1 Knapsack Problem
 Given a list of items with values and weights, as well as a max weight, find the
maximum value you can generate from items where the sum of the weights is less than
the max.
 */

class Solution {
  public static void main(String[] args) {
  
    int val[] = new int[] { 60, 100, 120 }; 
    int wt[] = new int[] { 10, 20, 30 }; 
    int W = 50; 
    int n = val.length; 
    System.out.println(knapsackProblem(W, wt, val, n));
    
  }
  
  private static int knapsackProblem(int W, int wt[], int val[], int n){
    
    int i, w; 
    int K[][] = new int[n + 1][W + 1]; 
    
    for(i = 0 ; i <= n ; i++){
      for(w = 0 ; w <= W ; w++){
        System.out.println("MaxWeight: "+w);
        if (i == 0 || w == 0) 
             K[i][w] = 0; 
        else if (wt[i - 1] <= w)
          //there is the possibility of carryig this item
          K[i][w] = Math.max(val[i-1] + K[i-1][w - wt[i-1]], K[i -1][w]);
        else 
          //I cant carry this item, I need to consider MAX value from previous
          K[i][w] = K[i - 1][w];
        
        System.out.println("K["+i+"]["+w+"]: "+K[i][w]);
      }
    }
    
    return K[n][W];
  }
  
  
  
}


