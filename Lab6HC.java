import java.util.Random;
import java.util.Scanner;



	public class Lab6HC {
			
		
		public static void selection_sort(int array[]) 
	    { 
	        int n = array.length; 
	  
	        // One by one move boundary of unsorted subarray 
	        for (int i = 0; i < n-1; i++) 
	        { 
	            // Find the minimum element in unsorted array 
	            int min_idx = i; 
	            for (int j = i+1; j < n; j++) 
	                if (array[j] < array[min_idx]) 
	                    min_idx = j; 
	  
	            // Swap the found minimum element with the first 
	            // element 
	            int temp = array[min_idx]; 
	            array[min_idx] = array[i]; 
	            array[i] = temp; 
	        } 
	    } 
		
		public static void build_MaxHeap(int[] array) {
			int n = array.length;
			//starting from parent of last leaf going up.
			for( int i = n/2 -1 ; i >=  0; i--) {
				max_Heapify(array, n, i);
				// max heapify
			}
	
		}
		
		public static void max_Heapify(int[] array, int n, int i) {
			// indexing scheme
			int max = i; 
			int left = 2*i +1; 
			int right = 2*i + 2;
			
			//if left child is the max
			if(left < n && array[left] > array[max]) {
				max = left;
			} 
			
			// when right child is the max 
	        if (right < n && array[right] > array[max]) 
	            max = right; 
	  
	        // If max is not root swap with max
	        if (max != i) 
	        { 
	            int temp = array[i]; 
	            array[i] = array[max]; 
	            array[max] = temp; 
	  
	            // Recursively heapify the affected sub-tree 
	            max_Heapify(array, n, max); 
	        } 
			
		}
		
		public static void heap_sort(int[] array) {
			int n = array.length;
			

			build_MaxHeap(array);
			for (int i = n-1; i >= 0; i--) {
				int temp = array[0];
				array[0] = array[i];
				array[i] = temp;
				
				// call max heapify on the reduced heap
				max_Heapify(array, i, 0);
			}
					
		}
		
		
		public static void main(String [] args) {
			
			Scanner in = new Scanner(System.in);
			String nString;
			double start, end, selectionSortTime = 0.00, heapSortTime = 0.00;
			int n;
			
			
			Random r = new Random(); 
			System.out.print("Please enter in a positive integer : ");
		nString = in.nextLine().trim();
		n = Integer.parseInt(nString);
		
		int[] array = new int[n];
		System.out.println("--------Generating Random Array with "
				+ n +  " elements-----");

		//start timer
		//heapsort
		start = System.nanoTime();
		// repeat heap_sort 100 times to find average
		for(int i = 0; i < 100; i ++) {
			for(int j = 0; j < array.length - 1; j ++) {
				array[i] = r.nextInt(1000 + 1 + 1000) - 1000;	  // generate random numbers -1000 to 1000
			}
			heap_sort(array);
		}
		
		end = System.nanoTime();
		heapSortTime = end - start/100;
		System.out.println("Average Running time for heap sort Time: " + heapSortTime + " nanoseconds");
		
		//start timer
		//selection sort
		start = System.nanoTime();
		// repeat heap_sort 100 times to find average
		for(int i = 0; i < 100; i ++) {
			for(int j = 0; j < array.length - 1; j ++) {
				array[i] = r.nextInt(1000 + 1 + 1000) - 1000;	  // generate random numbers -1000 to 1000
			}

			selection_sort(array);
		}
		
		
		end = System.nanoTime();
		selectionSortTime = end - start/100;
		System.out.println("Average Running time for selection sort Time: " + selectionSortTime + " nanoseconds");
		
		
		
		
	}
}
