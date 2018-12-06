import java.util.Random;
import java.util.Scanner;

public class Lab5HC {
	
	
	
	public static int maxCrossSum(int[] array, int low, int mid, int high) {
		
		int tempSum = 0;
		int leftSum = Integer.MIN_VALUE;
		
		// starts from mid to low
		for (int i = mid; i >= low; i --) {
			tempSum += array[i];
			if (tempSum > leftSum)
				leftSum = tempSum;
		}
		
        // Include elements on right of mid 
        tempSum = 0; 
        int rightSum =Integer.MIN_VALUE;
        // starts from mid +1 to high
        for (int i = mid + 1; i <= high; i++) 
        { 
            tempSum +=  array[i]; 
            if (tempSum > rightSum) 
            	rightSum = tempSum; 
        } 
        
        return leftSum + rightSum;
        
	}

	/**
	 * the maxmium sub
	 * @param array
	 * @return - integer value of sum
	 */
    public static int maxSubSum(int[] array, int low, int high) 
    { 	
    	//Base Case: Only one element
    	if (low == high){
    		// returns just one element
    		// because since that would be the max sum.
    		return array[high]; 
    	}else {
    	
    	int mid = (low + high) / 2;
    	
    	int leftSum = maxSubSum(array, low, mid);
    	int rightSum = maxSubSum(array, mid + 1, high);
    	int crossSum = maxCrossSum(array, low, mid, high);
    	
    	// left sum is greatest
        if(leftSum >= rightSum && leftSum >= crossSum) 
        	{
        	return leftSum;
        	}
        //right sum is the greatest
        else if (rightSum >= leftSum && rightSum >= crossSum) 
        	{
        	return rightSum;
        	}
        
        //the sum in between is the greatest
        else 
        	{	
        	return crossSum;
        	}
    	}
    } 
    
    /**
     * finds the max subarray in T(N) = n.
     * @param array - array to find max sum
     * @return - int value of sum
     */
    public static int mssN(int[] array) 
    { 
        int size = array.length; 
        int maxSum = -101, sum = 0; 
  
        for (int i = 0; i <  size; i++) 
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
		int n;

		Random r = new Random(); 
		System.out.print("Please enter in a positive integer : ");
		nString = in.nextLine().trim();
		n = Integer.parseInt(nString);
		
		int[] array = new int[n];
		
		System.out.println("--------Generating Random Array with "
				+ n +  " elements-----");
		
		for(int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(100 + 1 + 100) - 100;// generate random numbers -1000 to 1000
			System.out.print(array[i] + " ");
		}
		
		System.out.println("\nOutput Sum of MSS with "
				+ "O(n) MSS function: " +  mssN(array));
		
		System.out.println("Output Sum of MSS with "
				+ "O(nlogn) MSS function: " 
				+  maxSubSum(array, 0, array.length - 1));
	}

}
