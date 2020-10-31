import java.util.*;

public class CardGameDiffPlayer {

  // NO MORE INSTANCE VARIABLES CAN BE DEFINED
  private Player[] players;	// players in this game
  private int numRounds;	// number of rounds in this game

  // constructor
  // YOU SHOULD NOT MODIFY THIS METHOD
  public CardGameDiffPlayer(Player[] players) {
    this.players = players;
    this.numRounds = players[0].numCardsInHand();
  }

  // implement this method
  public void play() {
	  ArrayList<Card> cardWinner = new ArrayList<Card>();
	  int n = numRounds;
	  final int leng = players.length;
	  while (n >= 1) {
		  for (int i = 0; i < players.length; i++) {
			  players[i].printHand();
		  }
		  for (int i = 0; i < players.length; i++) {
			  System.out.println(players[i].getName() + " plays " + players[i].playCard());
		  }
		  for (int i = 0; i < players.length; i++) {
			  cardWinner.add(i, players[i].playCard());
		  }
		  
		  Card max = cardWinner.get(0);
		  for (int i = 1; i < leng; i++) {
			  if (cardWinner.get(i).compareTo(max) == 1) {
				  max = cardWinner.get(i);
			  }
		  }
		  int winnerIndex = cardWinner.indexOf(max);
		  Player winner = players[winnerIndex];
		  System.out.println("The winner of this round is " + winner.getName());
		  
		  
		  for (int j = 0; j < leng; j++) {
			  ArrayList<Card> removed = players[j].copy();
			  removed.remove(cardWinner.get(j));
			  n = removed.size();
		  }
		  System.out.println();
	  }
  }
}
