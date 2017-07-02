/**
 * Implements the Mark class consisting of marks and remarks of students assessments
 * @author Bazil Muzaffar Kotriwala
 * @version 1.0
 */

public class Mark {
	private int mark;
	private String comment;
	
	/**
	 * This constructs the marks and the respective optional comments for a students assessments.
	 * @param mark marks received by a student for a specific assessment 
	 * @param comment an optional remark given to a student for a specific assessment
	 */
	
	public Mark(int mark, String comment) {
		this.mark = mark;
		this.comment = comment;
	}
	
	/**
	 * This method returns the mark for the specific assessment received by a student
	 * @return mark received
	 */
	
	public int getMark() {
		return mark;
	}
	
	/**
	 * This method sets the mark received by a student for the specific assessment
	 * @param mark mark received
	 */
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	/**
	 * This method returns the remark given to a student against the respective mark they have received.
	 * @return remark received
	 */
	
	public String getComment() {
		return comment;
	}

	/**
	 * This method sets the remark given to a student against for the specific assessment
	 * @param comment remark for a specific assessment
	 */
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	/**
	 * This method returns the description of the marks and remarks received by the student for a specific assessment
	 * @return description of marks
	 */
	
	public String description(){
		return "Mark: " + mark + "\n"  + "Comment: " + comment;
	}
}