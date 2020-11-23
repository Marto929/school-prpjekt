package domashnoit;
import java.util.Scanner;
public class Cards_08 {

	public static void main(String[] args) {
		
		int[] deck = new int[52];
		for (int i = 0; i<52; i++) {
			deck[i] = i;
		}
		
		for(int i = 0; i<52; i++) {
			int randomIndex = (int) (Math.random() * 10);
			int swap = deck[randomIndex];
			deck[randomIndex] = deck[i];
			deck[i] = swap;
		}
		
		int[] drawnCards = new int[4];
		for(int i = 0; i<4; i++) {
			int randomIndex = (int) (Math.random() * (52 - i));
			drawnCards[i] = deck[randomIndex];
			for(int j = randomIndex; j<deck.length - i - 1; j++) {
				deck[j] = deck[j + 1];
			}
			deck[deck.length - i - 1] = -1;
			
		}
		for(int i = 0; i<4; i++) {
			int colorIndex = drawnCards[i] / 13;
			int valueIndex = drawnCards[i] % 13;
			String cardColor = "";
			String cardValue = "";
			
			switch(colorIndex) {
			case 0: cardColor = "Spades"; break;
			case 1: cardColor = "Hearts"; break;
			case 2: cardColor = "Diamonds"; break;
			case 3: cardColor = "Clubs"; break;
			}
			
			switch(valueIndex){
			case 0: cardValue = "2"; break;
			case 1: cardValue = "3"; break;
			case 2: cardValue = "4"; break;
			case 3: cardValue = "5"; break;
			case 4: cardValue = "6"; break;
			case 5: cardValue = "7"; break;
			case 6: cardValue = "8"; break;
			case 7: cardValue = "9"; break;
			case 8: cardValue = "10"; break;
			case 9: cardValue = "Jack"; break;
			case 10: cardValue = "Queen"; break;
			case 11: cardValue = "King"; break;
			case 12: cardValue = "Ace"; break;
			}
			
			System.out.print(cardValue + " of " + cardColor + ", ");
		}
		
		
		
	}

}