/**
 * 
 */

/**
 * @author Bazil Muzaffar Kotriwala
 *
 */
public class UniversityDriver {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		University uniObject = new University();
		uniObject.printStatus();
		
		uniObject.CreateUnits();
		uniObject.DisplayUnits();
		System.out.println("Goodbye!");
				
	}

}
