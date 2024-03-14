package chapter01;

public class ForExample {
	public static void main(String[] args) {
		/*
		 * 반복문
		 * - for문, while문, do-while문
		 * 
		 * for(초기화식;조건식;증감식){
		 * 		실행문
		 * }
		 */
		int sum = 0;
		//1부터 5까지 합을 구하세요
		/*
		for(int i = 1; i <= 5; i++) {
			sum += i;
		}
		System.out.println(sum);
		*/
		
		//초기화식의 변수는 일반 변수처럼 이름을 지어 사용 가능
		//초기화식의 변수는 소괄호와 중괄호 내에서 사용 가능
		
		for(int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		//중첩 for
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < i; j++) {
				System.out.println(sum);
			}
		}
		
	}
}
