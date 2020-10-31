public class SCPlayer extends Player {
	public SCPlayer(String name) {
		super(name);
	}
	
	public Card playCard() {
		Card min = cards.get(0);
		return min;
	}
}
