/* Binary search algorithm. */ 

public int binarySearchItem(int[] sortedArray, int value) {
	int index = -1;
	int low = 0;
	int high = sortedArray.length;

	while (low <= high) {
		int mid = (low + high) / 2;
		if (sortedArray[mid] < value) {
			low = mid + 1;
		} else if (sortedArray[mid] > value) {
			high = mid - 1;
		} else if (sortedArray[mid] == value) {
			index = mid;
			break;
		}
	}
	return index;
}