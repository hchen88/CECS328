
import java.util.Random;
import java.util.Scanner;

public class Lab3 {
	
	public static int[] quick_sort(int[] array) {

		return n; 
	}
	
	public int partition (int[] array, int low, int high) {
		//figure out pivot
		int midpoint = array.length/2;
		//median of the first, middle, and last 
		if(array[0] > array[midpoint]) {
			
		}
		
	}
	public static int[] insertion_sort(int[] array) {
		int indx = 0;
		while(array[index] )
		return n;
	}
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		String nString;
		int n, totalTimes = 100;
		Random r = new Random(); 
		System.out.println("Please enter in a positive integer :");
		nString = in.nextLine().trim();
		n = Integer.parseInt(nString);
		int[] array = new int[n];
		for( int i = 0; i < n -1; i++) {
			array[i] = r.nextInt(5000 + 1 + 5000) - 5000;
		}
		
		int sorted[] = quick_sort(array);
	}

}
