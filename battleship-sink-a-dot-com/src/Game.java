
public class Game {

	public static void main(String[] args) {
		int numOfGuesses = 0;
		
	
		GameHelper helper = new GameHelper();
		SimpleDotCom game = new SimpleDotCom();
		
		int randomStart = (int) Math.floor(Math.random()*10);
		int[] locations = {randomStart, randomStart+1, randomStart+2};
		game.setLocationCells(locations);
		
		Boolean isAlive = true;
		
		
		while(isAlive) {
			// ask userinput
			String userInput = helper.getUserInput("Enter guess:");
			String result = game.checkYourself(userInput);
			numOfGuesses++;
			if(result.equals("Kill")) {
				isAlive = false;
			}
		}
		
		System.out.println("You took " + numOfGuesses + " guesses");
	}

}
