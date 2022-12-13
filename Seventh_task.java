public class Main {
	//function to sort an array using "Quick sort" algorithm
	public static void quick_sort(int[] array, int left, int right) {
		//condition to avoid endless recursion
		if (left < right) {
			//call a function to find the pivot then store it in a variable
			int p = divide(array, left, right);
			//use the recursion to sort the subarrays 
			quick_sort(array, left, p - 1);
			quick_sort(array, p + 1, right);
		}
	}
	//function to detect the position of the pivot (place of partitioning)
	private static int divide(int array[], int left, int right) {
		//create a variable that contain the position of the pivot
		int i = left - 1;
		/*loop to make the numbers before (i+1) smaller than 
		  the numbers after the (i+1)*/
		for (int j = left; j < right; j++) {
			if (array[j] < array[right]) {
				i++;
				swap(array, i, j);
			}
		}
		//make the the last element in the array in the right position
		swap(array, i + 1, right);
		//return the position of the pivot "(i+1)"
		return i + 1;
	}
	//function to swap two elements of an array
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {
		//create an array with elements
		int[] array = { 5, 3, 8, 6, -10 };
		//call the sorting function to sort the created array
		quick_sort(array, 0, array.length - 1);
		//print the array after sorting
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ "  ");
		}
	}
}