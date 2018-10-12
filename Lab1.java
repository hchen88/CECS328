import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/**
 * CECS 328 Lab 1
 * @author Howrad Chen
 *
 */

public class Lab1 {
	
	
	public static int linearSearch(int[] a, int key) {
		for ( int i = 0; i< a.length -1; i ++) {
			if(a[i] == key) {
				return i; // returns index found
			}	
		}
		
		return -1; // returns -1 if number not found
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, key;
		Random r = new Random();
		double start, stop, binaryTime = 0.00, linearTime = 0.00;
		double bTotalTime = 0, lTotalTime = 0;
		
		
		//Part A	
		System.out.println("Please enter in a positive integer:");
		n = in.nextInt();
		System.out.println(n);
		int[] a = new int[n];
		
		for(int i = 0; i < a.length - 1; i ++) {
			
			a[i] = r.nextInt(1000);	 // not sure 
		}
		
		Arrays.sort(a);
		for(int i = 0; i < 100; i++) {
			key = a[r.nextInt(n)];
			start = System.nanoTime();
			Arrays.binarySearch(a, key);
			stop = System.nanoTime();
			binaryTime = stop - start;
			bTotalTime += binaryTime;
			start = System.nanoTime();
			linearSearch(a, key); // no need to return.
			stop = System.nanoTime();
			linearTime = stop - start;
			lTotalTime += linearTime;
			}
		
		System.out.println("Avergae Binary Search Time: " + bTotalTime/100 + " nanoseconds"
				+ "\nAverage Linear Search Time: " + lTotalTime/100 + " nanoseconds" );
		
		
		//Part B
		System.out.println("Please enter in a positive integer:");
		n = in.nextInt();
		System.out.println(n);
		a = new int[n];
		
		for(int i = 0; i < a.length - 1; i ++) {
			
			a[i] = r.nextInt(1000);	 // not sure 
		}
		
		Arrays.sort(a);
		key = 5000;
		start = System.nanoTime();
		Arrays.binarySearch(a, key);
		stop = System.nanoTime();
		binaryTime = stop - start;

		start = System.nanoTime();
		linearSearch(a, key); // no need to return.
		stop = System.nanoTime();
		linearTime = stop - start;

		System.out.println("Binary Search time : " + binaryTime + "\nLinear Search Time: " + linearTime);
		
		//Generate a random in between -1000 to 1000. and save them in an array a.
		
		
		
	}

}
