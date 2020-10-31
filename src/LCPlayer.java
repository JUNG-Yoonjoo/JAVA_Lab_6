public class LCPlayer extends Player {
	public LCPlayer(String name) {
		super(name);
	}
	
	public Card playCard() {
		Card max = cards.get(cards.size()-1);
		return max;
	}
}
