import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class University {
	
	ArrayList<Unit> unitArrayList = new ArrayList<Unit>();
	
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
		
		unitArrayList.add(new Unit("FIT1234", "Advanced Bogosorts"));
		unitArrayList.add(new Unit("FIT2027", "Introduction to Spaghetti Coding"));
		unitArrayList.add(new Unit("FIT3456", "Enterprise Fizzbuzz"));
		
		//Task 5
		//Student student1 = new Student("12345678", "Victor", "Chang");
		//Student student2 = new Student("12345679", "Fred", "Nurke");
		//Student student3 = new Student("12345680", "Indira", "Naidu");
		
		//Task 6
		Student student1 = new Student(readString("Enter studentID: "), readString("Enter the student's first name: "), readString("Enter the student's last name: "));
		Student student2 = new Student(readString("Enter studentID: "), readString("Enter the student's first name: "), readString("Enter the student's last name: "));
		Student student3 = new Student(readString("Enter studentID: "), readString("Enter the student's first name: "), readString("Enter the student's last name: "));
		
		unitArrayList.get(0).enrolStudent(student1);
		unitArrayList.get(0).enrolStudent(student2);
		unitArrayList.get(1).enrolStudent(student3);
		unitArrayList.get(2).enrolStudent(student3);
		
	}
	
	public void	DisplayUnits() {
		for(int i=0; i < unitArrayList.size(); i++){
			System.out.println("");
			System.out.println(unitArrayList.get(i).description());
			
			System.out.println("Enrolled Students: ");
			
			String[] enrolled_students = unitArrayList.get(i).enrol();
			for(int j=0; j < enrolled_students.length; j++){
				System.out.println(enrolled_students[j]);
			
			}
		}
	}
}
