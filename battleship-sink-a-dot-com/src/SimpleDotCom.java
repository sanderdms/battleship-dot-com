
public class SimpleDotCom {
		
	int[] locationCells;
	int numOfHits;
	
	public void setLocationCells(int[] locations) {
		locationCells = locations;
	}
	
	public String checkYourself(String stringGuess) {
		//convert the user input to integer
		int guess = Integer.parseInt(stringGuess);
		// Declare a sring to hold result. default is miss
		String result = "Miss";
		
		//REPEAT for each locationCell
		for(int cell : locationCells) {
			//COMPARE the user guess to cell
			//IF guess match
			if(guess == cell) {
				result = "Hit";
				//INCREMENT the number of hits
				numOfHits++;
				break;
			}
		}
		
		// FIND OUT IF it was last location cell
		if(numOfHits == locationCells.length) {
			result = "Kill";
		}
		
		System.out.println(result);
		return result;
	}
	
	
}
