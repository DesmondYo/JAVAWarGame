package JAVALastHomework.War;

import java.util.ArrayList;
import java.util.List;

//1C.
public class Player {

	//I 1, 2, 3
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;

	//I2.
	public Player() {
		score = 0;
	}

	//II1.
	public void describe() {
		System.out.println("Name of the player " + name);
		for(Card card : hand) {
			card.describe();
		}
	}
	
	//II2.
	public Card flip() {
		return hand.remove(0);
	}
	
	//II3.
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	//II4.
	public void incrementScore(){
		score += 1;
	}

	//II2.
	public int getScore() {
		return score;
	}

	public int getValue() {
		return 0;
	}
}
	
