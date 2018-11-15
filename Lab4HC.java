import java.util.Random;
import java.util.Scanner;

public class Lab4HC {
	
	/**
	 * this method finds the pivot, then divides/partitions the array into subarrays.
	 * @param array - the array to partition
	 * @param start - the start of the partition
	 * @param end - the end of the partition
	 * @return - returns the index of the partition
	 */
	public static int partition (int[] array, int start, int end) {
		//figure out pivot
		int midpoint = (int) Math.ceil(array.length/2);
		int pivotValue = 0, temp, pivotIndex = 0;
		int k = start -1;
		
		//median of the first, middle, and last to figure out pivot
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
		
		//swap pivot with last index.	
		temp = array[end];
		array[end] = array[pivotIndex];
		array[pivotIndex] = temp;
		
	
		for( int i = start; i < end; i++) {
			if( array[i] <= pivotValue) {
				k++;// increments pointer
				//swap the elements at k position with i.
				temp = array[k];
				array[k] = array[i];
				array[i] = temp;
			}
		}
		//swaps out of place arrays
		temp = array[k+1];
		array[k+1] = array[end];
		array[end] = temp;
		
		return k+1; //returns partition index.
	}
	public static int Quick_select(int[] array) {
		int partitionIndx = 0;
		partitionIndx = partition( array, 0, array.length -1);
		
		
		return 0;
	}
	
	public static int[] quick_sort(int[] array) {
		//calls sort to start sort.
		sort(array, 0, array.length-1); 
		return array;
	}
	
	
	/**
	 * this method is used to sort each partition.
	 * @param array - the array to sort
	 * @param start - the start of the array
	 * @param end - the end index of the array
	 */
	public static void sort(int[] array, int start, int end)  {
		if (start < end)
		{
			int partitionIndex = partition(array, start, end);
			//recursive call dividing array
			sort(array, start, partitionIndex -1);
			sort(array, partitionIndex+1, end);
		}
		
	}

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		String nString;
		double start, stop, insertionTime = 0.00, quickSortTime = 0.00, insertionTotal= 0.00, quickSortTotal = 0.00;
		int n, k = -1, totalTimes = 100;
		int[] sortedArray;
		
		
		//tests arrays
//		int[] array = { -1, -2, 0 , 2, 3, 4, -2, 100};
//		System.out.print("Unsorted: [");
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + ", ");
//		}
//		System.out.print("]\n");
//		
//		int[] sortedArray = quick_sort(array);
//		System.out.print("Sorted: [");
//		for (int i = 0; i < sortedArray.length; i++) {
//			System.out.print(sortedArray[i] + ", ");
//		}
//		System.out.print("]");
		
		
		Random r = new Random(); 
		System.out.print("Please enter in a positive integer : ");
		nString = in.nextLine().trim();
		n = Integer.parseInt(nString);
		
		int[] array = new int[n];
		
		System.out.println("--------Generating Random Array with "
				+ n +  " elements-----");
		for(int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(100 + 1 + 100) - 100;	 // generate random numbers -1000 to 1000
		}
		
		for(int i = 0; i < array.length; i++) {
			if ( i < array.length -2) {
				System.out.print(array[i] + ", ");
			}else {
				System.out.print(array[i]);
			}
		}
		while(k < 0 || k > n ) {
			System.out.print("\nPlease enter a number between 1 to " + n 
					+ "(as the kth least element): " );
			nString = in.nextLine().trim();
			k = Integer.parseInt(nString);
		}
		
//		System.out.println("The kth leas element is " + 
//				array[Quick_select(array)]);

		
		//function call to find and print kth least elemnet
		
	}
		
		
}