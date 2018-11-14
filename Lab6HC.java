import java.util.Random;
import java.util.Scanner;

	public class Lab6HC {
		public static void main(String [] args) {
			
			Scanner in = new Scanner(System.in);
			String nString;
			double start, stop, insertionTime = 0.00, quickSortTime = 0.00, insertionTotal= 0.00, quickSortTotal = 0.00;
			int n, k = -1, totalTimes = 100;
			int[] sortedArray;
			
			
			Random r = new Random(); 
			System.out.print("Please enter in a positive integer : ");
		nString = in.nextLine().trim();
		n = Integer.parseInt(nString);
		
		int[] array = new int[n];
		System.out.println("--------Generating Random Array with "
				+ n +  " elements-----");
		
		
	}
}
