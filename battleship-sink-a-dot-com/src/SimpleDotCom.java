import java.util.ArrayList;

public class SimpleDotCom {
		
	private ArrayList<String> locationCells;
	int numOfHits;
	
	public void setLocationCells(ArrayList<String> locations) {
		locationCells = locations;
	}
	
	public String checkYourself(String stringGuess) {
		// Declare a sring to hold result. default is miss
		String result = "Miss";
		int index = locationCells.indexOf(stringGuess);
		
		// check if indexOf exists. It should return index int or -1 if not found
		if(index >= 0) {
			// remove it because it just got hit
			locationCells.remove(index);
			
			//if there are no more cells left, its killed
			if(locationCells.isEmpty()) {
				result = "Kill";
			}else {
				result = "Hit";
			}	
		}
		
		System.out.println(result);
		return result;
	}
	
	
}
