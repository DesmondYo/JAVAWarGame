package JAVALastHomework.War;

//2.
public class App {

	public static void main(String[] args) {
		
		//3.
		Deck deck = new Deck();
		Player playerOne = new Player();
		Player playerTwo = new Player();
 		
		deck.shuffle();
		
		//4.
 		for(int i = 0; i < 26; i++) {
			playerOne.draw(deck);
			playerTwo.draw(deck);
 		}
 		
 		//5, 5A.
 		for(int i = 0; i < 26; i++) {
 			Card playerOneCard = playerOne.flip();
 			Card playerTwoCard = playerTwo.flip();
 			if(playerOneCard.getValue() > playerTwoCard.getValue()) {
 				playerOne.incrementScore();
 			} else if (playerTwoCard.getValue() > playerOneCard.getValue()) {
 				playerTwo.incrementScore();
			}
 			//6.
 			System.out.println("Player 1's Score is = " + playerOne.getScore());
 			System.out.println("Player 2's Score is = " + playerTwo.getScore());
 		}
 		
 		//7.
 		if(playerOne.getScore() > playerTwo.getScore()) {
 			System.out.println("Player 1 is the champion!! ");
 		} else if((playerTwo.getScore() > playerOne.getScore())){
 			System.out.println("Player 2 is the Champion!!");
 		} else if (playerOne.getScore() == playerTwo.getScore()) {
			System.out.println("Its a Tie, lets play again!");
		}
 	}
}
