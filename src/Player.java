import java.util.ArrayList;

public abstract class Player {

  // NO MORE INSTANCE VARIABLE CAN BE DEFINED
  protected String name;  // name of the player
  protected ArrayList<Card> cards; // cards the player has

  // YOU CANNOT MODIFY THIS FUNCTION
  public Player(String name) {
    this.name = name;
    cards = new ArrayList<Card>();
  }

  public String getName() {
    return name;
  }
  
  public void addCard(Card card) {
	   int i = 0;
	   while (i < cards.size() && cards.get(i).compareTo(card) < 0) {
	    	 i++;
	   }
	   cards.add(i, card);
  }
  
  public abstract Card playCard();  
    
  public int numCardsInHand() {
	  return cards.size();
  }
  
  public ArrayList<Card> copy(){
	  return cards;
  }
  
  // YOU CANNOT MODIFY THIS FUNCTION
  public void printHand() {
    System.out.print(name);
    System.out.println(" has cards: " + cards);
  }
}
