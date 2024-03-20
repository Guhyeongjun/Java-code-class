package chapter05;

public class IPhone1 extends Phone{
	public IPhone1(String name) {
		this.name = name;
	}

	@Override
	public void function() {
		if (this.name.equals("아이폰12")) {
			super.function();
		}
		
		System.out.print(" apple pay기능을 가지고 있다.");
	}
	
	
}
