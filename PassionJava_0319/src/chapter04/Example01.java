package chapter04;

public class Example01 {

		public static void main(String[] args) {
			Data01 data01 = new Data01();
			//클래스에 생성자를 정의하지 않고도
			//인스턴스를 생성할 수 있다
			//=>클래스에 생성자가 하나도 정의되지 않은 경우
			//컴파일러는 자동적으로 아래와 같은 내용의
			//기본 생성자를 추가하여 컴파일 한다
			//기본 생성자 : 클래스이름(){}
			//Example01(){}
		}
}
