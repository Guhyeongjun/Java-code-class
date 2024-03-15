package chapter03;

public class Method01 {
	public static void main(String[] args) {
		
		hiEveryone(14);
		hiEveryone(21);
		hiEveryone(35 );
	}
		/*
		 * 메소드(Method), 함수(function)
		 * - 기능별로 코드를 객체로 모으고
		 * 객체 끼리는 메세지로써 상호작용 해야 한다
		 * 
		 * 리턴타입 메소드이름(매개변수){
		 * 
		 * 메소드 이름 규칙
		 * 1. 소문자 시작 단어가 조합될 때 대문자 변수의 경우에는 처음 단어가 명사, 메소드의 경우에는 처음 단어가 동사
		 * 
		 * }
		 */
		public static void hiEveryone(int age) {
			System.out.println("좋은 아침입니다");
			System.out.println("제 나이는 " + age + "세 입니다");
		}
		
	
}
