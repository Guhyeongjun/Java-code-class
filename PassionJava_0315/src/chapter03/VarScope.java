package chapter03;

public class VarScope {
	public static void main(String[] args) {
		//변수의 스코프(scope)
		//같은 영역 내에서 동일 이름의 변수 선언 불가
		int num1 = 11;		
		if(true) {
			int num2 = 42;
		}
		if(false) {
			int num2  = 43;
		}
	}
}
