package warCardGame;

public class App {

	public static void main(String[] args) {
		//Instantiation of two players, and their beginning score of 0
		Player playerUno = new Player("Jackie", 0);
		Player playerDos = new Player("Daytona", 0);
		
		//Line 11 instantiates the deck while Line 12 will shuffle said deck
			Deck deck = new Deck();
			deck.shuffle();
		//The following for loop will create each player's hand, playerUno will receive the evens, and playerDos will receive odd.	
			for(int i = 0; i < 52; i++) {
				if(i % 2 == 0) {
					playerUno.drawCard(deck);
				}
				else {
					playerDos.drawCard(deck);
				}
			}
			//Showing each player's initial score, and the hand that they drew prior to playing the game.
			playerUno.describePlayer();
			playerDos.describePlayer();
			
			//This for loop represents the the 26 rounds that they are going to play, which will flip the index 0 hand array, and remove it
			//during game play
			for(int i = 0; i < 26; i++) {
				Card playerUnoCard = playerUno.flipCard();
				Card playerDosCard = playerDos.flipCard();
				//if statement if playerUno's card is greater than playerDos' card, which will increment playerUno's score,
				//and it will then display the score to see who is in the lead and who won the round
				if(playerUnoCard.getValue() > playerDosCard.getValue()) {
					System.out.println("----------------------------------------------");
					playerUnoCard.describeCard();
					playerDosCard.describeCard();
					System.out.println(playerUno.getPlayerName() + " wins Round: " + i);
					playerUno.incrementScore(i);
					System.out.println(playerUno.getPlayerName() + "'s score is: " + playerUno.getScore());
					System.out.println(playerDos.getPlayerName() + "'s score is: " + playerDos.getScore());
					System.out.println("----------------------------------------------");
			}
				//if statement if playerDos' card is greater than playerUno's card, which will increment playerDos' score,
				//and it will then display the score to see who is in the lead and who won the round
				else if(playerUnoCard.getValue() < playerDosCard.getValue()) {
					System.out.println("----------------------------------------------");
					playerUnoCard.describeCard();
					playerDosCard.describeCard();
					System.out.println(playerDos.getPlayerName() + " wins Round: " + i);
					playerDos.incrementScore(i);
					System.out.println(playerUno.getPlayerName() + "'s score is: " + playerUno.getScore());
					System.out.println(playerDos.getPlayerName() + "'s score is: " + playerDos.getScore());
					System.out.println("----------------------------------------------");;
				}
				else {
					//Else statement in the case that two cards are of equal value, no score is awarded , and a draw is stated with no points given
					System.out.println("**********************************************");
					playerUnoCard.describeCard();
					playerDosCard.describeCard();
					System.out.println(playerUno.getPlayerName() + "'s score is: " + playerUno.getScore());
					System.out.println(playerDos.getPlayerName() + "'s score is: " + playerDos.getScore());
					System.out.println("It is a draw for Round: " + i);
					System.out.println("**********************************************");
				}
			
	}			
			/*
			 * Final display of the score, along with the if else statement on who is the winner based on the boolean statement of which score is higher.
			 */
			playerUno.describePlayer();
			playerDos.describePlayer();
			System.out.println(" ");
			if(playerUno.getScore() > playerDos.getScore()) {
				System.out.println(playerUno.getPlayerName() + " is the Winner!");
			}
			else if(playerUno.getScore() < playerDos.getScore()) {
				System.out.println(playerDos.getPlayerName() + " is the Winner!");
			}
			else {
				System.out.println("Tie game between " + playerUno.getPlayerName() + " and " + playerDos.getPlayerName());
			}
}
}

