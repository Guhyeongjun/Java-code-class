package chapter01;

//음료수 자판기


public class Drink {
	private String name;
	private double capacity;
	private int price;
	
	public void setDrink(String n, double c, int p) {
		name = n;
		capacity = c;
		price = p;
	}
	
	public void gerDrink() {
		System.out.println(name);
		System.out.println(capacity + "ml");
		System.out.println(price + "원");
	}

	public static void main(String[] args) {
		Drink drink = new Drink();
		drink.setDrink("오로나민C", 120, 1200);
		drink.gerDrink();
	}
}
