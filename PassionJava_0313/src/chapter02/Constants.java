package chapter02;

public class Constants {
	public static void main(String[] args) {
		/* 상수(Constants)
		 * - 변수에 값을 딱 한 번만 할당할 수 있다
		 * - 한 번 할당된 값을 변경이 불가능하다
		 * - 키워드 final 선언이 붙어 있는 변수
		 * 
		 * 상수의 이름
		 * - 모두 대문자로 짓는 것이 관례
		 * - 단어의 연결은 언더바(_)
		 */
		final int MAX_SIZE = 100;
		
		final String STR = "문자열";
		final int CONST_ASSIGNED;
		CONST_ASSIGNED = 10;
		
		// 1. 상수는 어플리케이션을 작성할 때 변하면 안되는 데이터는 상수로 설정
		// 2. 상수는 변수보다 메모리 효율이 좋다
		
		/*
		 * 리터럴(Literals)에 대한 이해
		 * - 자료형을 기반으로 표현이 되는 상수를 의미한다
		 * - 정수는 무조건 int형으로 인식하기로 약속되어 있음
		 * - 자바에서 리터럴 정수는 int형이기 때문에 int형이
		 * 표현할 수 있는 범위는 -21억 ~ 21억 범위를 벗어나면
		 * 컴파일 에러가 발생한다
		 * System.out.println("2200000000"); // 오류
		 * - long형 상수(리터럴)의 표현 방법
		 * System.out.println("2200000000L");
		 */
		int num1 = 5 + 7; // 리터럴 5 , 7
		double num2 = 3.3 + 4.5; // 리터럴 3.3 , 4.5
		String str = "I love Java";
		
		//정수형 상수의 언더바 삽임
		int money = 1_000_000;
		System.out.println(money);
		
		//실수형 리터럴
		//double 임을 명시하기 위해 d 또는 D삽입
		System.out.println(3.00049990d);
		
		//float 임을 표현하기위해 f 또는 F삽입
		System.out.println(2.00049990f);
		
		//실수형 리터럴은 e 표기법도 가능
		System.out.println(3.4e3);
		
		//부울형 리터럴
		System.out.println(true);
		System.out.println(false);
		
		//문자형 리터럴 char
		System.out.println('한');
		
		//문자열 리터럴 String
		System.out.println("한글");
		
		/*
		 * 이스케이프 시퀸스(escape sequences)
		 * - 화면상의 어떠한 상황 또는 상태를 표현하기 위해 약속된 문자
		 * - / : 슬래시 , \ : 백슬래시
		 * - \n : 개행문자
		 */
		
		//인용문을 쓸 때 \"
		//"" - 문자열의 리터럴 시작과 끝
		
		System.out.println("제임스 왈 \"계속 노력해라.\" " );
		
		// \t - 탭문자
		
		// \ 백슬러시를 단순 문자로 사용하고 싶을 때 \\
		
	}
}
