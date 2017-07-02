import java.util.*;

public abstract class Assessment {
	private int weight;
		
	HashMap<String, Mark> marks = new HashMap<String, Mark>();
	
	public Assessment(int weight) {
		setWeight(weight);
	}
	
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if (weight >= 1 && weight <= 100){
			this.weight = weight; }
	}
	
	public abstract String description();
	// An abstract method contains a method signature, but no method body.
	
	public void addMarks(String studentId, Mark m){
		marks.put(studentId, m);
	}


	
	








}
