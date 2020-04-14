/*
 Counting sort algorithm
 */

class Solution {
  
    static int[] sortScores(int[] array, int maxValue){    
      
     
      
      int[] result = new int[maxValue];
      
      for (int score : array) {
          result[score]++;
      }
      
      int[] sorted = new int[array.length];
      int resultCount = 0;
      
      for(int i = 0 ; i < result.length ; i++){
         if(result[i] > 0) {
           for(int count = 0; count < result[i]; count ++){
             sorted[resultCount] = i;
             resultCount++;
           }
         }
           
      }
      
      return sorted;
      
   }    
  
    public static void main(String[] args) 
    { 
        int[] unsortedScores = {37, 89, 41, 65, 91, 53};
        final int HIGHEST_POSSIBLE_SCORE = 100;

        int[] sortedScores = sortScores(unsortedScores, HIGHEST_POSSIBLE_SCORE);
        
        for(int i = 0 ; i < sortedScores.length ; i++){
         System.out.println(sortedScores[i]);
        }
    }  
  
}
