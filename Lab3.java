import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab3 {
	
	public static int[] quick_sort(int[] array, int start, int end) {
		if(start < end) {
			partitioned = partition(array, start, end);
			
			quickSort(array, low, partitioned -1);
			quickSort(array, partitioned + 1, high);
		}
			
		}
		return n; 
	}
	
	public int partition (int[] array, int low, int high) {
		//figure out pivot
		int midpoint = array.length/2;
		//median of the first, middle, and last 
		if(array[0] > array[midpoint]) {
			
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
		
		Random r = new Random(); 
		System.out.println("Please enter in a positive integer :");
		nString = in.nextLine().trim();
		n = Integer.parseInt(nString);
		int[] array = new int[n];
		start = System.nanoTime();
		int[] sortedArray = insertion_sort(array);
		stop = System.nanoTime();
		insertionTime = stop - start;
		System.out.println("Average Time to Sort Random array with Insertion Sort: " + insertionTime/totalTimes + " nanoseconds" );
		System.out.println("Average Time to Sort Random array with Insertion Sort: " + insertionTime/totalTimes + " nanoseconds" );
		


		
//		for( int i = 0; i < n -1; i++) {
//			array[i] = r.nextInt(5000 + 1 + 5000) - 5000;
//		}
		

	}
}