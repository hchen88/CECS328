package projectIO;
/**	
 * Scott Arima and Howard Chen
 * 24 October 2018
 * Purpose of the program- To demonstrate Handling Exceptions using File I/O and 
 * the adapter Design pattern with a Star Trek's Universal Translator for today's 
 * cell phones.
 * Inputs: N/A
 * Output: Exception Messages, CellPhone actions and translated texts.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class VulcanText implements AlienCellPhone{
	
	public VulcanText() {
		
	}
	/**
	 * this overridden method for VulcanText sends a Text from an AlienCellPhone
	 * @param fileName - the fileName as a string(.txt).
	 */
	@Override
	public void alienSendText(String fileName) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Method not in use.");
	}
	/**
	 * this overridden method for VulcanText reads a Text from an AlienCellPhone
	 * @param fileName - the fileName toe be read as a string(.txt).
	 */
	@Override
	public void alienReadText(String fileName) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Method not in use.");
	}
	/**
	 * this overridden method for VulcanText returns the name of the output file
	 * @param fileName - the fileName as a string(.txt).
	 * @return the translated text as a string.
	 */
	@Override
	public String translateText(String fileName) {
		// TODO Auto-generated method stub
		try {
			File inFile = new File(fileName);
			Scanner in = new Scanner(inFile);
			PrintWriter out = new PrintWriter("VulcanTranslated.txt");
			String translatedText = "";
			while(in.hasNext()) {
				String str = in.nextLine();
				for (int i = str.length()-1; i>= 0; i--) {
					translatedText += str.charAt(i);
				}
				out.println(translatedText);
			}
			in.close();
			out.close();
			return translatedText;
		} catch(FileNotFoundException exception) {
			return "File: " + fileName + " does not exist";
		}
	}
	/**
	 * to string method for the VulcanText object
	 */
	public String toString() {
		return "Vulcan";
	}

}
