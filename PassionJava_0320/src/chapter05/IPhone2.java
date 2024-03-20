package chapter05;

public class IPhone2 extends IPhone1{
	public IPhone2(String name) {
		super(name);  
	}
	
	@Override
	public void function() {
		super.function();
		System.out.print("홍채기능을 가지고 있다.");
	}
}
