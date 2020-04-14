/* Binary Search using a recursive method */

public int runBinarySearchRecursively(
  int[] sortedArray, int key, int low, int high) {
    int middle = (low + high) / 2;
         
    if (high < low) {
        return -1;
    }
 
    if (key == sortedArray[middle]) {
        return middle;
    } else if (key < sortedArray[middle]) {
        return runBinarySearchRecursively(
          sortedArray, key, low, middle - 1);
    } else {
        return runBinarySearchRecursively(
          sortedArray, key, middle + 1, high);
    }
}