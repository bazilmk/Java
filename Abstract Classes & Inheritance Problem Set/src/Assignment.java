
public class Assignment extends Assessment {
	private String title;
	
	public Assignment(int weight, String title){
		super(weight);
		setTitle(title);
	}
	
	public void setTitle(String title){
		this.title = title;
	}

	public String description(){
		return "Assignment: " + title + ", weight " + getWeight() + "%";
	}
	
}
