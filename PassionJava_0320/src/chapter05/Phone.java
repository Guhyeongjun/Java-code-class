package chapter05;

public class Phone {
	
	String name = "핸드폰";
	public void function(){
		System.out.print("은 지문인식기능을 가지고 있다.");
	}
	
	public void print() {
		System.out.print(name);
		function();
	}
	
}
