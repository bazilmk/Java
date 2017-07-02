

public class University {
	
    Unit unitObject = new Unit("FIT3140", "Advanced Programming");
	Unit [] unitArray = new Unit[3];

    public void printStatus() {
        System.out.println("Welcome to Java University");
        System.out.println();
        System.out.println("Thank you for using Java University");
        System.out.println();
        System.out.println(unitObject.getUnitDescription());
    }

	public void CreateUnits() {
		unitArray[0] = new Unit("FIT2004", "ADS");
		unitArray[1] = new Unit("FIT2099", "OOP");
		unitArray[2] = new Unit("ETW1000", "Business Econ Stats");
	}
	
	public void	DisplayUnits() {
		for(int i=0; i<unitArray.length; i++){
			System.out.println(unitArray[i].getUnitDescription());
		}
	
	}	
			
		
}	