import java.util.HashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class University {
	
	ArrayList<Unit> unitArrayList = new ArrayList<Unit>();
	
	/* Using a HashMap, as ordering of the studentId's does not matter as opposed to Treemaps in which ordering matters
	 * HashMap has a better average case complexity of insertion which is constant time complexity as opposed to Treemaps Logarithmic complexity.
	 */
	
	HashMap<String, Student> students = new HashMap<String, Student>();
	
    private String readString(String prompt){
    	System.out.println(prompt);
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = null;
    try {
    	s = in.readLine();
    } catch (IOException e) {
    	e.printStackTrace();
    }
    return s;
  }
	
	public void printStatus() {
        System.out.println("Welcome to Java University");
        System.out.println();
        
        CreateUnits();
		DisplayUnits();
		System.out.println("\nThank you for using Java University");
    }
	
	public void CreateUnits() {
		
		unitArrayList.add(new Unit(new AssessmentScheme(new Exam(50,50), new Assignment(50, "Assignment1")), "FIT1234", "Advanced Bogosorts"));
		unitArrayList.add(new Unit(new AssessmentScheme(new Exam(60, 45), new Assignment(60, "Assignment2")), "FIT2027", "Introduction to Spaghetti Coding"));
		unitArrayList.add(new Unit(new AssessmentScheme(new Exam(65,55), new Assignment(55, "Assigment3")), "FIT3456", "Enterprise Fizzbuzz"));
		
		//Task 5
		Student student1 = new Student("12345678", "Victor", "Chang");
		Student student2 = new Student("12345679", "Fred", "Nurke");
		Student student3 = new Student("12345680", "Indira", "Naidu");
		admitStudent(student1);
		admitStudent(student2);
		admitStudent(student3);
		
		Exam e1 = new Exam(50,50);								// Assessment objects of subclass to add marks for the student for that exam/assignment
		Assignment a1 = new Assignment(50, "Assignment1");
		Mark mark1 = new Mark(95, "Excellent");
		e1.addMarks(student1.studentId, mark1);
		Mark mark2 = new Mark(75, "");							// optional comment can be passed through as an empty string if no comment wants to be passed
		a1.addMarks(student2.studentId, mark2);
		Mark mark3 = new Mark(49, "Fail");
		a1.addMarks(student3.studentId, mark3);
		
		//System.out.println(mark1.getMark());
		//System.out.println(mark1.getComment());		
		//System.out.println(mark2.getMark());
		//System.out.println(mark2.getComment());
		//System.out.println(mark3.getMark());
		//System.out.println(mark3.getComment());
		
		//Task 6
		//Student student1 = new Student(readString("Enter studentID: "), readString("Enter the student's first name: "), readString("Enter the student's last name: "));
		//Student student2 = new Student(readString("Enter studentID: "), readString("Enter the student's first name: "), readString("Enter the student's last name: "));
		//Student student3 = new Student(readString("Enter studentID: "), readString("Enter the student's first name: "), readString("Enter the student's last name: "));
		//admitStudent(student1);
		//admitStudent(student2);
		//admitStudent(student3);
		
		
		unitArrayList.get(0).enrolStudent(student1);
		unitArrayList.get(0).enrolStudent(student2);
		unitArrayList.get(1).enrolStudent(student3);
		unitArrayList.get(2).enrolStudent(student3);
		
	}
	
	
	public void admitStudent(Student s){ 
		students.put(s.studentId, s);
	}
	
	public boolean assessmentsCompleted(AssessmentScheme a, Student s){
		boolean result = true;
		for(int i = 0; i < a.getAssessmentSchemeList().size(); i++){
			if(a.getAssessmentSchemeList().get(i).marks.get(s.studentId) == null);
					result = false;
		}
		return result;
	}
	
	public void	DisplayUnits() {
		for(int i=0; i < unitArrayList.size(); i++){
			System.out.println("");
			System.out.println(unitArrayList.get(i).description());
			
			System.out.println("Enrolled Students: ");
			Student[] enrolled_students = unitArrayList.get(i).enrol(this);
			for(int j=0; j < enrolled_students.length; j++){
				System.out.println(enrolled_students[j].description());
			}
	
	}			
				
}
}