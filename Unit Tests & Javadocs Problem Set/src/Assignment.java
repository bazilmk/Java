/**
 * Implements the Assignment sublass of the superclass Assessment
 * @author Bazil Muzaffar Kotriwala
 * @version 1.0
 */

public class Assignment extends Assessment {
	private String title;
	
	/**
	 * This constructs an assignment with its respective weight and title
	 * @param weight weightage of the assignment
	 * @param title title of the assignment
	 */
	
	public Assignment(int weight, String title){
		super(weight);
		setTitle(title);
	}
	
	/**
	 * This method sets the title of the assignment
	 * @param title title of the assignment
	 */
	
	public void setTitle(String title){
		this.title = title;
	}

	/**
	 * This method returns the description of the assignment
	 * @return description of the assignment
	 */
	
	public String description(){
		return "Assignment: " + title + ", weight " + getWeight() + "%";
	}
	
}