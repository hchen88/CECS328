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
public interface EarthCellPhone {
	/**
	 * this method sends a text from the Earth Cell phone
	 * @param languageType - language as a string variable
	 * @param fileName - fileName as a string variable
	 * @throws InvalidLanguageException - the custom exception 
	 * to throw for invalid language
	 */
	public void sendMessage(String languageType, String fileName)
			throws InvalidLanguageException;
	/**
	 * this method reads a text from the Earth Cell phone
	 * @param fileName as a string variable
	 */
	public void readMessage(String fileName);
}
