package chapter03;

public class Method04 {
	public static void main(String[] args) {
		//값을 반환하는 메소드
		//return : 값의 반환을 명령
		adder();
		System.out.println(adder());
		System.out.println(adder2(4,54));
	}
	
	public static int adder() {
		return 0;
	}
	
	public static int adder2(int num1, int num2) {
		int addResult = num1 + num2;
		return addResult;
	}
}
