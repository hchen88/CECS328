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
public class InvalidLanguageException extends Exception {
	
	private String languageType = "N/A";
	
	/**
	 * constructor for InvalidLanguageException
	 * @param languageType - the language type that is invalid as a string
	 */
	public InvalidLanguageException(String languageType) {
		this.languageType = languageType;
	}
	
	/**
	 * this getter method to return the invalid language type as a string.\
	 * @return invalid language type as a string.
	 */
	public String getMessage() {
		return "Language: " + languageType + " not supported";
	}
	/**
	 * to string method for the InvalidLanguageException
	 */
	public String toString() {
		return "InvalidLanguageException";
	}
}
