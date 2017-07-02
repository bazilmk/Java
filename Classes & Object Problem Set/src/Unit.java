/**
 * 
 */

/**
 * @author Bazil Muzaffar Kotriwala
 *
 */

public class Unit {
	 private String unitCode;
	 private String unitName;
	 
	 public Unit(String unitCode, String unitName){
		 this.unitCode = unitCode;
		 this.unitName = unitName;
	 }
	 
	 public String getUnitDescription(){
		 return unitCode + " " + unitName;
	 }
	 
	 
	 
}

