package module6321;

public class Card {
	private String value;
	private String color;
	private boolean distributed=false;
	
	public Card(String value, String color) {
		this.value = value;
		this.color = color;
	}
	
	public String toString() {
		return this.value + ":" + this.color;
	}
	
	public void distribute() {
		this.distributed = true;
	}
	
	public boolean isPlayed() {
		return this.distributed;
	}
}
