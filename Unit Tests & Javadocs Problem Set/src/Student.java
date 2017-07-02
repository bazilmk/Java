/**
 * 
 */

/**
 * @author Bazil Muzaffar Kotriwala
 *
 */

import java.util.*;
import java.lang.Exception;

public class Student {
	public final String studentId;
	private String givenName;
	private String familyName;
	
// Adv of using String: You would never run out of combinations
// Disadv of using String: Uses up much more space as compared to integers
// Adv of using Integer: Efficient in using memory, great for smaller databases (saves space)
// Disadv of using Integer: You may possibly run out of integer combinations
	
// givenName instead of firstName because givenname is the one used on their passport
// familyName instead of lastName because everyone does not have a lastname
	
	public Student (String newStudentId) throws InvalidIdException{
		if (newStudentId.length() != 8) {
			throw new InvalidIdException("Size of ID can only be 8 characters");
		}
		else
		studentId = newStudentId;
	}
	
	public Student(String newStudentId, String newGivenName, String newFamilyName) throws InvalidIdException{
		this(newStudentId);
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