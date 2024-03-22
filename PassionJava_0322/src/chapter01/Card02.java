package chapter01;

public class Card02 {
	
	private String kind;
	private int number;
	
	public Card02() {
		this("SPADE",1);
	}
	public Card02(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	//일반적으로 인스턴스나 클래스에 대한 정보 또는
	//인스턴스 변수들의 값을 문자열로 반환하여 반환하도록 오버라이딩되는 것이 보통이다
	
	@Override
	public String toString() {
		return "Card02 [kind=" + kind + ", number=" + number + "]";
	}
	
	
}
