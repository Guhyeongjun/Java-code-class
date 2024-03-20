package chapter04;

public class Product {
	private int price;
	private int bonusPoint;
	
	public Product(int price) {
		super();
		this.price = price;
		this.bonusPoint = (int)(price / 10);
		
	}
	
	
}
