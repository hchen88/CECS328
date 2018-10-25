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
public class AdapterPatternDemo {

	public static void main(String[] args) {

		//Create two earth cell phones
		      EarthText et = new EarthText();
		      EarthText et2 = new EarthText();

		try {
		//Earth1 sends a text message to Earth
		//but the file with the message does not
		//exist
		      et.sendMessage("Earth", "Earth.txt2");
		//Earth sends a good message to Earth
		      et.sendMessage("Earth", "Earth.txt");
		//Earth2 reads the message sent by Earth1
		      et2.readMessage("Earth.txt");
		//Earth1 sends a message to Klingon
		      et.sendMessage("Klingon", "Klingon.txt");
		//Before Klingon can read the message
		//it needs to go to the universal translator
		//for translation from earth to klingon
		      UniversalTranslator ut = new UniversalTranslator(new KlingonText());
		//create a new cellphone from the universal
		//translator to read the Klingon message
		      EarthCellPhone e3 = ut;
		      e3.readMessage("Klingon.txt");
		//Earth1 sends a message to Vulcan
		      et.sendMessage("Vulcan", "Vulcan.txt");
		//Before Vulcan can read the message
		//it needs to go to the universal translator
		//for translation from earth to vulcan
		      ut = new UniversalTranslator(new VulcanText());
		//Read the Vulcan message
		      e3 = ut;
		      e3.readMessage("Vulcan.txt");
		//Send a message to an unsupported language
		      et.sendMessage("non-fed", "non-fed.txt");
		   } catch (InvalidLanguageException ile){
			   System.out.println(ile.getMessage());
		   }
		}
	
}
