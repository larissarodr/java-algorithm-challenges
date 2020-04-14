/* Write a method that prints the duplicate elements of a given array. */

class Solution {
  public static void main(String[] args) {
   int[] vector = {2,1,2,1};
   findDuplicates(vector);
  }
  
  public static void findDuplicates(int[] vector) {
    
    ArrayList<Integer> result = new ArrayList<>();
    
    for(int i = 0 ; i < vector.length ; i++){
      int value = vector[i];
      if(result.contains(value)) continue;
      
      for(int j = 0 ; j < vector.length ; j++){  
        if(j == i) continue;
        if(vector[j] == value){
          result.add(value);
          break;
        }
      }
    }
    for(Integer value : result){
      System.out.println(value);
    }
  }
}
