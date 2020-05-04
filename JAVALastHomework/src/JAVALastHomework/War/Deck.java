package JAVALastHomework.War;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

	//1B.
	public class Deck {
	
		//I1.
		private String[] suits = {"Diamonds", "Hearts", "Spades", "Clubs"};
		
		List<Card> cards = new ArrayList<Card>();
	
				//II3.
				public Deck() {
					for(int i = 0; i < 4; i++){
						for(int j = 2; j < 15; j++) {
				        cards.add(new Card(suits[i], j));
				       
						}
					}
				}
	//II1.
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	//II2.
	public Card draw() {
		return cards.remove(0);
	}
	
}
