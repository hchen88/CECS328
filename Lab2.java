import java.util.Scanner;

public class Lab2 {

	
	public void binarySearch() {
		
		
	}
	
	public static int squareRoot(int n) {
		
		return (int)Math.sqrt(n);
	}
	public static void main() {
		Scanner in = new Scanner(System.in);
		String nString;
		System.out.println("Enter in an integer N");
		nString = in.nextLine().trim();
		int n = Integer.parseInt(nString);
		int nRoot = squareRoot(n);
		
		System.out.println("Enter in a random binary array having the"
				+ " first K numbers equal to 0 and the rest equal to 1.");
		String binaryArrayString = in.nextLine().trim();
		
		
		
		
		
		
		
	}
}
