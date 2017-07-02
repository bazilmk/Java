import java.util.*;

public class AssessmentScheme {
	
	/**
	 * AssessmentScheme is a collection of Assessments
	 */

	private ArrayList<Assessment> assessmentSchemeList = new ArrayList<Assessment>();
	
	public AssessmentScheme (Assessment... as){
		for(int i = 0; i < as.length; i++)
			getAssessmentSchemeList().add(as[i]);
	}

	public ArrayList<Assessment> getAssessmentSchemeList() {
		return assessmentSchemeList;
	}

	public void setAssessmentSchemeList(ArrayList<Assessment> assessmentSchemeList) {
		this.assessmentSchemeList = assessmentSchemeList;
	}

}	