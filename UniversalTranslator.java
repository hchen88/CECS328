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
import java.util.Scanner;

public class UniversalTranslator implements EarthCellPhone{
	
	private AlienCellPhone alienPhone;
	
	/**
	 * constructor for UniversalTranslater
	 * @param alienPhone - the alienPhone object set.
	 */
	public UniversalTranslator(AlienCellPhone alienPhone) {
		this.alienPhone = alienPhone;
	}
	/**
	 * this overridden method sends a Text.
	 * @param fileName - the fileName as a string(.txt).
	 */
	@Override
	public void sendMessage(String languageType, String fileName) throws InvalidLanguageException {
		// TODO Auto-generated method stub
		try {
			if(!languageType.equals("Earth") && !languageType.equals("Klingon") && !languageType.equals("Vulcan")) {
				throw new InvalidLanguageException(languageType);
			}
			File inFile = new File(fileName);
			Scanner in = new Scanner(inFile);
			System.out.println(languageType + " Message Sent");
			in.close();
		} catch (FileNotFoundException exception) {
			System.out.println("File: " + fileName + " does not exist");
		}
	}
	/**
	 * this is the overridden method that reads a text from
	 * @param fileName - fileName as a string variable
	 *
	 */
	@Override
	public void readMessage(String fileName) {
		// TODO Auto-generated method stub
		System.out.print(alienPhone + " ");
		System.out.println(alienPhone.translateText(fileName));
	}
	/**
	 * to string method for the UniversalTranslator object
	 */
	public String toString() {
		return "Universal Translator";
	}
}
