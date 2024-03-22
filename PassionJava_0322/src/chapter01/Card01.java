package chapter01;

public class Card01 {
	
	private String kind;
	private int number;
	
	public Card01() {
		this("SPADE",1);
	}
	public Card01(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	
}
