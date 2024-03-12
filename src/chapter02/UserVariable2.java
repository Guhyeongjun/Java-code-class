package chapter02;

public class UserVariable2 {
	public static void main(String[] args) {
		/*
		 * 변수의 이름
		 * 
		 * 카멜 표기법(camel)
		 * - 소문자로 시작 다른 단어가 조합될 때 대문자 시작
		 */
		
		/* 정사각형의 넓이를 구하는 코드 작성
		 * 공식 : 한변의 길이 x 한번의 길이
		 * 정사각형의 한번의 길이 : 7
		 */
		System.out.println(7*7);
		
		// 실수 - 실제하는 수, 소수점 자리
		// 그 변수의 용도를 표현하는 이름이 가장 좋은 변수 이름
		
		int squareSide;
		squareSide = 7;
		System.out.println(squareSide * squareSide);
		squareSide = 70;
		System.out.println(squareSide);
		
		// cpu개발할 때 int형 자료를 기본으로 연산한다고 생각하고
		// 개발하기 때문에 int형 자료의 계산이 가장 빠르다
	}
}
