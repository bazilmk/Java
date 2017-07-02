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
	 
	 // As we do not know the exact number of students, therefore ArrayList is used as it does not have a fixed size.
	 private ArrayList<Student> students = new ArrayList<Student>();
	 
	 public Unit(String unitCode, String unitName){
		 this.unitCode = unitCode;
		 this.unitName = unitName;
	 }
	 
	 public String description(){
		 return unitCode + " " + unitName;
	 }
	 
	 public void enrolStudent(Student newStudent){
		 students.add(newStudent);
	 }
	 
	 public String[] enrol(){
		 String[] studentstemp = new String[students.size()];
		 for(int i = 0; i<students.size(); i++){
			 studentstemp[i] = students.get(i).description();
		 }
		 return studentstemp;	 
			 
	 }
	 
}