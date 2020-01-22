
public class SimpleDotCom {
	
	
	int[] locationCells;
	int numOfHits;
	
	
	public String checkYourself(String guess) {
		
		//convert the user input to integer
		//REPEAT for each locationCell
			//COMPARE the user guess to cell
			//IF guess match
				//INCREMENT the number of hits
				// FIND OUT IF it was last location cell
				// IF number of hits is 3 => kill
				// ELSE => Hit
			//ELSE => Miss
		//END REPEAT	
		
		return "Hit, Miss or Kill";
	}
	
	public void setLocationCells(int[] locations) {
		this.locationCells = locations;
	}
	
	

}
