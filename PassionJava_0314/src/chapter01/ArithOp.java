package chapter01;

public class ArithOp {
	public static void main(String[] args) {
		/*
		 * {연산자}
		 * 
		 * 대입 연산자
		 * = : 연산자 오른쪽에 있는 값을 연산자 왼쪽에 대입
		 * + : 두 피 연산자의 값을 더한다
		 * - : 빼기
		 * * : 곱하기
		 * / : 나누기
		 * % : 나머지를 반환하는 연산자
		 */
		int n1 = 10;
		int n2 = 3;
		int result = n1 / n2;
		System.out.println(result);
		
		int r1 = n1 % n2;
		System.out.println(r1);
		
		//연산자의 우선순위
		// *, / 곱하기와 나누기가 우선 연산 된다
		int r2 = 2 - 1 - 3 * 2;
		System.out.println(r2); 
		
		//우선 순위를 위해 소괄호를 사용 가능
		int r3 = (3 + 3) * 2;
		System.out.println(r3);
		
		//복합 대입 연산자
		int num = 1;
		num += 5; // num = num + 5;
		System.out.println(num);
		
		/* 관계 연산자
		 * - 값은 true , false (참 or 거짓)
		 */
		
		// < : n1 < n2 (n1이 n2보다 작은가?)
		int number1 = 0;
		int number2 = 1;
		System.out.println(number1 < number2); // true
		
		// > : n1 > n2 (n1이 n2보다 큰가?)
		System.out.println(number1 > number2); // false
		
		// <= : 같거나 작은가
		System.out.println(number1 <= number2); // true
		
		// >= : 같거나 큰가?
		System.out.println(number1 >= number2); // false
		
		// == : 같은가?
		int number3 = 0;
		System.out.println(number1 == number3); // true
		
		// != : 다른가?
		System.out.println(number1 != number2); // true
		
		// 정수와 실수를 비교 할 때는 값만 비교 한다
		double number4 = 1.0;
		System.out.println(number2 == number4); // true
		
		/*
		 * 논리 연산자
		 * & : 엠퍼센트
		 * & : 논리 and, A && B (A와 B 모두 true 이면 연산 결과는 true)
		 * 
		 * - 논리 and(&&)
		 *   : 피연산자 1 / 피연산자2 / 연산 결과
		 *   :   true   /   true  /   true
		 *   :   false  /   true  /   false
		 *   
		 * || : 논리 or, A || B (A와 B 둘 중 하나라도 true 이면 연산 결과는 true)
		 * 
		 * - 논리 or(||)
		 *   : 피연산자 1 / 피연산자2 / 연산 결과
		 *   :   true   /   true  /   true
		 *   :   false  /   true  /   true
		 *   :   false  /   false /   false
		 *   
		 * ! : 논리 not, !A (연산 결과는 A가 true 이면 false, A가 false 이면 true)  
		 */
		
	}
}
