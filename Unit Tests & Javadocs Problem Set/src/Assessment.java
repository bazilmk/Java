import java.util.*;

/**
 * Implements Abstract Assessment Class
 * @author Bazil Muzaffar Kotriwala
 * @version 1.0
 */


public abstract class Assessment {
	private int weight;
		
	HashMap<String, Mark> marks = new HashMap<String, Mark>();
	
	/**
	 * This constructs an assessment with a specified weight between 1 and 100 inclusive.
	 * @param weight - associated weight of the assessment ranging between 1 and 100 inclusive.
	 */
	
	public Assessment(int weight) {
		setWeight(weight);
	}
	
	/**
	 * This method returns the weight of the assessment
	 * @return weight of the assessment
	 */
	
	public int getWeight() {
		return weight;
	}

	/**
	 * This method sets the weight of the assessment if it is between 1 to 100 inclusive.
	 * @param weight of the assessment
	 */
	
	public void setWeight(int weight) {
		if (weight >= 1 && weight <= 100){
			this.weight = weight; }
	}
	
	/**
	 * An abstract method of description of the assessment, which contains a method signature but no method body
	 */
	
	public abstract String description();
	
	/**
	 * This method adds the marks and the comment of the respective student to the marks HashMap.
	 * @param studentId - Acts as a key for the HashMap of Marks
	 * @param m - The marks object(consisting of marks and an optional comment) is the value for a respective studentId(key)
	 */
	
	public void addMarks(String studentId, Mark m){
		marks.put(studentId, m);
	}
}