import java.util.ArrayList;

public class SimpleDotComTestDrive{
	
	public static void main(String[] args) {
		// Instantiate SimpleDotCom object
		SimpleDotCom dot = new SimpleDotCom();	
		// Assign a location
		ArrayList<String> locations = new ArrayList<String>();
		locations.add("1");
		locations.add("2");
		locations.add("3");
		dot.setLocationCells(locations);
		// Create a String to represent user input
		String userGuess = "2";
		// invoke checkYourself passing String
		String result = dot.checkYourself(userGuess);
		// set default testResult to failed
		String testResult = "failed";
		// Set testResult "passed" if the test outputs the expected "hit" (don't test for case)
		if(result.toLowerCase().equals("hit")) {
			testResult = "passed";
		}
		// Print out the test result
		System.out.println(testResult);
	}
	
}
