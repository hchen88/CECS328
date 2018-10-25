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
public interface AlienCellPhone {
	/**
	 * this method sends a Text from an AlienCellPhone
	 * @param fileName - the fileName as a string(.txt).
	 */
	public void alienSendText(String fileName);
	/**
	 * this method reads a Text from an AlienCellPhone
	 * @param fileName - the fileName toe be read as a string(.txt).
	 */
	public void alienReadText(String fileName);
	
	/**
	 * this method returns the name of the output file
	 * @param fileName - the fileName as a string(.txt).
	 * @return the translated text as a string.
	 */
	public String translateText(String fileName);
}
