/* Given two arrays, create a class that returns the median of all elements. */

class Solution {
  public static void main(String[] args) {
    int[] arr1 = {1,3,5};
    int[] arr2 = {2,4,6};
    double median = 0;
    //median(arr1, arr2) = ​3.5
    
    int aLen = arr1.length;
    int bLen = arr2.length;
    int[] result = new int[aLen + bLen];

    System.arraycopy(arr1, 0, result, 0, aLen);
    System.arraycopy(arr2, 0, result, aLen, bLen);
    
    Arrays.sort(result);
     
    if (!(result.length % 2 == 0)) {
      median = result[(result.length / 2)];
    } else {
      median = (double) (result[(result.length / 2)] + result[((result.length / 2) - 1)])/2;
    }
    
    System.out.println(median);
    
  }
}
