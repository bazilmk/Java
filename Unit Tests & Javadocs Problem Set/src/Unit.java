/**
 * 
 */

/**
 * @author Bazil Muzaffar Kotriwala
 *
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.Arrays;

public class Unit {
	 private String unitCode;
	 private String unitName;
	 private AssessmentScheme scheme;
	 
	 // As we do not know the exact number of students, therefore ArrayList is used as it does not have a fixed size.
	 
	 private ArrayList<String> enrolledStudents = new ArrayList<String>();
	 
	 public Unit(AssessmentScheme scheme, String unitCode, String unitName){
		 this.scheme = scheme;
		 this.unitCode = unitCode;
		 this.unitName = unitName;
	 }
	 
	 public String description(){
		 return unitCode + " " + unitName;
	 }
	 
	 public void enrolStudent(Student newStudent){
		 enrolledStudents.add(newStudent.studentId);
	 }
	 
	 
	 public Student[] enrol(University uni){
		 Student[] studentstemp = new Student[enrolledStudents.size()];
		 for(int i = 0; i<enrolledStudents.size(); i++){
			 studentstemp[i] = uni.students.get(enrolledStudents.get(i));
		 }
		 return studentstemp;	 
			 
	 }
}