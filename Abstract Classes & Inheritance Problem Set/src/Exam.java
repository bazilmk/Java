
public class Exam extends Assessment {
	private int duration;
	
	public Exam(int weight, int duration){		
		super(weight);
		setDuration(duration);
	}
	
	public void setDuration(int duration){
		if (duration >= 30 && duration <= 180)
		this.duration = duration;
	}
	
	public String description(){
		return "Exam: duration " + duration + " minutes, weight " + getWeight() + "%";
	}
	
}
