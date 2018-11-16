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
	
	
	/**
	 * this method is used to sort each partition.
	 * @param array - the array to sort
	 * @param start - the start of the array
	 * @param end - the end index of the array
	 */
	public static int quick_select(int[] array, int start, int end, int k)  {
		if( k> 0 && k <= end - 1 + 1) {
			int i = partition(array, start, end);
			
			if ( i - 1 == k -1) 
				return array[i];
			
			if( k - 1< i - start) {
				return quick_select(array, start, i -1, k );
			}
			
			return quick_select(array, i + 1, end, k- i +1-1);	
		}
		 return 0;
		
	}

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		String nString;
		int n, k = -1;
	
		
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
		
		System.out.println("The kth least element is " + 
				quick_select(array, 0, n-1, k));

		
	}
		
		
}