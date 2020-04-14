/*
 * LIS - Longest Increasing Subsequence
 Find a subsequence of a given sequence in which the subsequence's elements are in sorted order, 
 lowest to highest, and in which the subsequence is as long as possible. 
 This subsequence is not necessarily contiguous, or unique.
 */

class Solution {
  public static void main(String[] args) {
    int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60, 80 }; 
    int n = arr.length; 
    System.out.println("Length of list is " + lis( arr, n ) + "\n" ); 
  }
  
  private static int lis(int[] arr, int n){
    int[] li = new int[n];
    int max = 0;
    
    for(int i = 0; i < li.length; i++){
      li[i] = 1;
    }
    
    for(int i = 1; i < arr.length; i++){
      for(int j = 0; j < i ; j++){
        if(arr[i] > arr[j] && li[j] + 1 > li[i]){
          li[i] = li[j] + 1;
        }
      }
    }
    
    
    for(int i = 0; i < li.length; i++){
      max = Math.max(max, li[i]);
    }
    
    return max;
  }
}