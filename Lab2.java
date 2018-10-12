import java.util.Scanner;

public class Lab2 {

	/**
	 * This program prompts the user to enter in a random binary 
	 * array having the first K numbers equal to -0 and the rest are equal o 1.
	 * 
	 * @return
	 */
	
	public static int binarySearch() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter in a random binary array having the"
				+ " first K numbers equal to 0 and the rest equal to 1.");
		String binaryArrayString = in.nextLine().trim();
		// 0000001111
		int[] intArray = new int[binaryArrayString.length()];
		
		
		for(int i = 0; i< binaryArrayString.length(); i ++) {
			intArray[i] = binaryArrayString.charAt(i); 		
		}
		
		for (int i = 0; i < intArray.length; i++) {
			if(intArray[i] == '1') {
				return i+1;
			}
		}
		return -1;
	}
	public static int squareRoot() {
		Scanner in = new Scanner(System.in);
		String nString;
		System.out.print("Enter in an integer N: ");
		nString = in.nextLine().trim();
		int n = Integer.parseInt(nString);
		return (int)Math.sqrt(n);
	}
	public static void main(String [] args) {
		
		System.out.println( "Your number is : " + squareRoot());
		int binaryIndex = binarySearch();
		if( binaryIndex == -1) {
			System.out.println("k is not found in binaryArray : " + binaryIndex);
		} else {
		System.out.println("k is found at : " + binaryIndex);
		}

	}
}
