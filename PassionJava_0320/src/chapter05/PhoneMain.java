package chapter05;

public class PhoneMain {
	
	public static void main(String[] args) {
		Phone p = new Phone();
		p.print();
		
		System.out.println();
		
		Phone p1 = new IPhone1("아이폰11");
		p1.print();
		
		System.out.println();
		
		IPhone1 p2 = new IPhone2("아이폰12");
		p2.print();
	}
}
