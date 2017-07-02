/**
 * Implements the Exam subclass of super class Assessment
 * @author Bazil Muzaffar Kotriwala
 * @version 1.0
 */

public class Exam extends Assessment {
	private int duration;
	
	/**
	 * This constructs an exam with its respective weight b/w 1-100 and duration b/w 30-180 inclusive.
	 * @param weight - weightage of the exam
	 * @param duration Time duration of the exam in minutes
	 * @throws InvalidDurationException Duration out of bounds either < 30 or > 180
	 */
	
	public Exam(int weight, int duration) throws InvalidDurationException{		
		super(weight);
		setDuration(duration);
	}
	
	/**
	 * This method sets the duration of the exam if its between the valid range, else its throws the required exception
	 * @param duration Time duration of the exam in minutes
	 * @throws InvalidDurationException Duration out of bounds either < 30 or > 180
	 */
	
	public void setDuration(int duration) throws InvalidDurationException{
		if (duration >= 30 && duration <= 180)
		this.duration = duration;
		
		else if(duration < 30){
			throw new InvalidDurationException("Exam duration too short");
		}	
		else
			{throw new InvalidDurationException("Exam duration too long");}
	}
	
	/**
	 * This method returns the description of the Exam
	 * @return Description of the exam
	 */
	
	public String description(){
		return "Exam: duration " + duration + " minutes, weight " + getWeight() + "%";
	}
	
}