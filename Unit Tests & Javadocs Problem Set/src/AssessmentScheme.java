import java.util.*;

public class AssessmentScheme {
	/**
	 * AssessmentScheme is a collection of Assessments
	 */

	private int sumWeight = 0;
	
	private ArrayList<Assessment> assessmentSchemeList = new ArrayList<Assessment>();
	
	public AssessmentScheme (Assessment... as) throws InvalidWeightException{
		for(int i = 0; i < as.length; i++)
			getAssessmentSchemeList().add(as[i]);

		for (int j = 0; j < as.length; j++){
			if (j > 0){
				checkWeight(sumWeight);
			}	
			for(int k = 0; k < 2; k++)
			sumWeight += getAssessmentSchemeList().get(k).getWeight();
	}
	}
	public ArrayList<Assessment> getAssessmentSchemeList() {
		return assessmentSchemeList;
	}

	public void setAssessmentSchemeList(ArrayList<Assessment> assessmentSchemeList) {
		this.assessmentSchemeList = assessmentSchemeList;
	}

	public void checkWeight(int sumWeight) throws InvalidWeightException{
		if(sumWeight != 100){
			throw new InvalidWeightException("Weight does not total upto 100");
			
		}
	}
	
}	