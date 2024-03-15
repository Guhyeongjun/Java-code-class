package chapter03;

public class MethodTest {
	public static void main(String[] args) {
		System.out.println("합 : " + add(5,8));
		System.out.println("차 : " + minus(4,2));
		System.out.println("곱 : " + multiply(2,8));
		System.out.println("나누기 : " + divide(12,6));
		System.out.println("나머지 : " + remain(43,7));
		System.out.println("직사각형 둘레 : " + recCircumferenceResult(5,7));
		System.out.println("직사각형 넓이 : " + recArea(5,7));
		System.out.println("삼각형 넓이 : " + triangleArea(8,7));
		System.out.println("원의 넓이 : " + circleArea(8));
		System.out.println("정사각형 넓이 : " + squareArea(9));
	}
	
	//두 수를 입력 받아 더한 값을 리턴 해주는 함수 만들기
	public static int add(int num1, int num2) {
		int addResult = num1 + num2;
		return addResult;
	}
	
	//두 수를 입력 받아 뺀 값을 리턴 해주는 함수 만들기
	public static int minus(int num1, int num2) {
		int minusResult = num1 - num2;
		return minusResult;
	}
	
	//두 수를 입력 받아 곱한 값을 리턴 해주는 함수 만들기
	public static int multiply(int num1, int num2) {
		int multiplyResult = num1 * num2;
		return multiplyResult;
	}
	
	//두 수를 입력 받아 나눈 값을 리턴 해주는 함수 만들기
	public static int divide(int num1, int num2) {
		int divideResult = num1 / num2;
		return divideResult;
	}
	
	//두 수를 입력 받아 나머지 값을 리턴 해주는 함수 만들기
	public static int remain(int num1, int num2) {
		int remainResult = num1 % num2;
		return remainResult;
	}
	
	//직사각형의 두변을 입력 받아 둘레는 리턴 해주는 함수
	public static int recCircumferenceResult(int side1, int side2) {
		int recCircumferenceResult = 2 * (side1 + side2);
		return recCircumferenceResult;
	}
	
	//직사각형의 두변을 입력 받아 넓이를 리턴 해주는 함수
	public static int recArea(int side1, int side2) {
		int recAreaResult = side1 * side2;
		return recAreaResult;
	}
	
	//삼각형의 밑변과 높이를 입력 받아 넓이를 리턴 해주는 함수
	public static double triangleArea(int base, int height) {
		double triangleAreaResult = base * height * 0.5;
		return triangleAreaResult;
	}
	
	//원의 반지름을 입력 받아 넓이는 리턴 해주는 함수
	public static double circleArea(int radius) {
		double circleAreaResult = radius * radius * 3.14;
		return circleAreaResult;
	}
	
	//정사각형의 한변을 입력 받아 넓이는 리턴 해주는 함수
	public static int squareArea(int side) {
		int squareAreaResult = side * side;
		return squareAreaResult;
	}
}
