package chapter04;

//고객, 물건을 사는 사람
public class Buyer {
	//소유 금액
	private int money = 1000;
	private int bonusPoint;
	//구입한 제품을 저장하기 위한 배열
	Product[] cart = new Product[100];
	//Product 배열에 사용될 카운터
	private int cnt = 0;
	
	//상품을 사는 메서드
	public void buy(Product p) {
		
	}
}
