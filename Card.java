package warCardGame;

public class Card {
	//These are the fields of Card: value can be seen as rank hierarchy, and the name is going to give the name of the number or Jack, Queen, etc.
	private int value;
	private String name; 
	
	/*I initially had use a for loop for the creation of the cards, but I got some help, and was able to use the switch break statements
	 * to provide a more cohesive code the Card class.
	 */
	public Card(int value, String suit) {
		
		switch (value) {
		case 2:
			name = "Two";
			break;
		case 3:
			name = "Three";
			break;
		case 4:
			name = "Four";
			break;
		case 5:
			name = "Five";
			break;
		case 6:
			name = "Six";
			break;
		case 7:
			name = "Seven";
			break;
		case 8:
			name = "Eight";
			break;
		case 9:
			name = "Nine";
			break;
		case 10:
			name = "Ten";
			break;
		case 11:
			name = "Jack";
			break;
		case 12:
			name = "Queen";
			break;
		case 13:
			name = "King";
			break;
		case 14:
			name = "Ace";
			break;

		}
		name += " of " + suit;
		this.value = value;
	}
		
	
	//Method used to get the suits
	public String getName() {
		return name;
	}
	//Method used to get the rank
	public int getValue() {
		return value;
	}
	//I am able to use this toString method to print out the 26 cards of a hand, and was originally being used for the describe()**
	/*public String toString() {
		String [] names = {"Clubs", "Spades", "Diamonds", "Hearts"};
		String [] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		return "This card is the: " + values[this.getValue()] + " of " + names[this.getName()];
}*/
//	public void describeCard() {
//	String [] names = {"Clubs", "Spades", "Diamonds", "Hearts"};
//	String [] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
//	System.out.println("This card is the: " + values[this.getValue()] + " of " + names[this.getName()]);
//}
	//Method used to describe the player's card when they flip, or it needs to be displayed on the console
	public void describeCard() {		
		System.out.println("Card drawn: " + getName() + ", Card Value: " + getValue());
	}
	
}
