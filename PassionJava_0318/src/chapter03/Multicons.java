package chapter03;

public class Multicons {
	private String name;
	private String phoneNumber;
	
	//생성자는 1개 이상 여러개 존재할 수 있다
	
	public Multicons(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public static void main(String[] args) {
		//DTO, VO 클래스를 작성할때는 두가지 방법
		//1. 생성자로 인스턴스 변수에 값을 대입하는 방법
		//2. getter setter 매소드로 값을 대입하는 방법
		
		/*
		 * 클래스의 이름 규칙
		 * 1. 클래스 이름의 첫 문자는 대문자로 시작한다
		 * 2. 둘 이상의 단어가 묶여서 하나의 이름을 이룰 때,
		 * 새로 시작하는 단어는 대문자로 한다 
		 * Camel Case 모델
		 * ex) Circle + Point = CirclePoint
		 */
	}
}
