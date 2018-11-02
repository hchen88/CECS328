import java.util.Random;
import java.util.Scanner;

public class Lab5HC {
	
	

	/**
	 * the maxmium sub
	 * @param array
	 * @return
	 */
    public static int MSSN(int[] array) 
    { 
        int size = array.length; 
        int maxSum = -101, sum = 0; 
  
        for (int i = 0; i < size; i++) 
        { 
            sum +=  array[i];
            //if the sum is the new max sum.
            if (maxSum < sum) 
                maxSum = sum;
            //sum is negative
            if (sum < 0)  
                sum = 0; 
        } 
        return maxSum; 
    } 
    
    public static int MSSNLOGN(int[] array) 
    { 
        int size = array.length; 
        int maxSum = -101, sum = 0; 
  
        for (int i = 0; i < size; i++) 
        { 
            sum +=  array[i];
            //if the sum is the new max sum.
            if (maxSum < sum) 
                maxSum = sum;
            //sum is negative
            if (sum < 0)  
                sum = 0; 
        } 
        return maxSum; 
    } 
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
		for(int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(100 + 1 + 100) - 100;	 // generate random numbers -1000 to 1000
		}
		
		
	}

}
