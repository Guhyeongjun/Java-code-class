package chapter01;

public class IfExample {
	public static void main(String[] args) {
		//조건문 : if문
		/*
		 * if(조건식) {
		 *	실행문A
		 * }
		 * 실행문 B
		 * 1. 조건식이 true 이면 실행문A가 실행
		 * 2. 조건식이 false 이면 실행문A가 실행되지 않고 실행문B가 실행
		 */
		
		boolean b = true;
		if(b) {
			System.out.println("if ()안의 결과가 true인 경우에만 실행");
		}
		System.out.println("코드의 끝줄 실행");
		
		//조건식이 true 가 될 때 실행해야 할 문장이 하나밖에 없다면
		//생략할 수 있습니다
		
		if(true)
			System.out.println("if 블록안에 포함되는 문장");
		
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다");
		}
	}
}
