import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab3 {

	//needs work
	public static int partition (int[] array, int start, int end) {
		//figure out pivot
		int midpoint = (int) Math.ceil(array.length/2);
		int pivotValue = 0, temp, pivotIndex = 0;
		int k = start -1;
		//median of the first, middle, and last 
		if(array[end] >= array[midpoint] && array[start] <= array[midpoint]
			|| array[end] <= array[midpoint] && array[start] >= array[midpoint]	) {
			pivotValue = array[midpoint];
			pivotIndex = midpoint;
		}
		if(array[midpoint] >= array[end] && array[end] >= array[start] ||
				array[midpoint] <= array[end] && array[end] <= array[start]) {
			pivotValue = array[end];
			pivotIndex = end;
		}
		
		if(array[midpoint] <= array[start] && array[end] >= array[start] ||
				array[midpoint] >= array[start] && array[end] <= array[start]) {
			pivotValue = array[start];
			pivotIndex = start;
		}
		
		System.out.println("Pivot: " + pivotValue + "Pivout Index: " + pivotIndex);
		
		
		//swap pivot with last index.	
		temp = array[array.length-1];
		array[array.length-1] = array[pivotIndex];
		array[pivotIndex] = array[end];

		
		for( int i = start; i < end; i++) {
			if( array[i] >= pivotValue) {
				k++;
				
			}
		}
//		
//		temp = array[k+1];
//		array[k+1] = array[end];
//		array[end] = temp;
		
		return k+1; //returns partition index.
	}
	
	
	public static void sort(int[] array, int start, int end)  {
		if (start < end)
		{
			int partitionIndex = partition(array, start, end);
			//recursive call dividing array
			sort(array, start, partitionIndex -1);
			sort(array, partitionIndex+1, end);
		}
		
	}

	public static int[] quick_sort(int[] array) {
		sort(array, 0, array.length-1); 
		return array;
	}
	
		
/**
 * this method takes an unsorted integer array of any size and sorts the array from least to greatest.
 * @param array - the unsorted array
 * @return the sorted integer array
 */
	public static int[] insertion_sort(int[] array) {
		
		for( int i = 0; i < array.length - 1; i++) {
			
			int currentNum = array[i]; //current number Index to check.
			int k = i-1; // previous index;
			//loops until correct index is found for number. starting from 0
			
			while (k >=0 && currentNum < array[k]) { 
				
				array[k+1] = array[k];
				k--;
				
			}
			
			array[k+1]= currentNum; // places number in correctly place
			
		}
		
		return array; //returns array
		
	}
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		String nString;
		double start, stop, insertionTime = 0.00, quickSortTime = 0.00;
		int n, totalTimes = 100;
		
		
		//tests arrays
		int[] array = { -1, -2, 0 , 2, 3, 4, -2, 100};
		System.out.print("Unsorted: [");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.print("]\n");
		
		int[] sortedArray = quick_sort(array);
		System.out.print("Sorted: [");
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + ", ");
		}
		System.out.print("]");
		
		
//		Random r = new Random(); 
//		System.out.println("Please enter in a positive integer :");
//		nString = in.nextLine().trim();
//		n = Integer.parseInt(nString);
//		int[] array = new int[n];
//		start = System.nanoTime();
//		int[] sortedArray = insertion_sort(array);
//		stop = System.nanoTime();
//		insertionTime = stop - start;
//		System.out.println("Average Time to Sort Random array with Insertion Sort: " + insertionTime/totalTimes + " nanoseconds" );
//		
//		start = System.nanoTime();
//		sortedArray = quick_sort(array);
//		stop = System.nanoTime();
//		quickSortTime = stop - start;
//		System.out.println("Average Time to Sort Random array with Quick Sort Time: " + quickSortTime/totalTimes + " nanoseconds" );
//		
		
		
		
		

	}
}