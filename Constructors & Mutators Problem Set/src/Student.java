/**
 * 
 */

/**
 * @author Bazil Muzaffar Kotriwala
 *
 */
public class Student {
	private String studentId;
	private String givenName;
	private String familyName;
	
// Adv of using String: You would never run out of combinations
// Disadv of using String: Uses up much more space as compared to integers
// Adv of using Integer: Efficient in using memory, great for smaller databases (saves space)
// Disadv of using Integer: You may possibly run out of integer combinations
	
// givenName instead of firstName because givenname is the one used on their passport
// familyName instead of lastName because everyone does not have a lastname
	
	public Student(String newStudentId){
		studentId = newStudentId;
	}
	
	public Student(String newStudentId, String newGivenName, String newFamilyName){
		studentId = newStudentId;
		givenName = newGivenName;
		familyName = newFamilyName;
	}
	

	public void setGivenName(String newGivenName){
		givenName = newGivenName;
	}
	
	public void SetFamilyName(String newFamilyName){
		familyName = newFamilyName;
	}
	
	public String description(){
		return studentId + " " + givenName + " " + familyName;
	}
	
	
}
