package chapter01;

public class Book {
	private String name;
	private int price;
	private String publisher;
	
	private String page;

	public void setBook(String n, int p, String pub) {
		name = n;
		price = p;
		publisher = pub;
	}
	
	public void getBook() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(publisher);
	}
	
	public static void main(String[] args) {
		Book book = new Book();
		book.setBook("컴퓨터 운영체제", 32000, "김자바");
		book.getBook();
		
		
	}
}
