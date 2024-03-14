package chapter01;

public class WhileExample {
	public static void main(String[] args) {
		/*
		 * while문
		 * 
		 * while(조건식){
		 * 	실행문
		 * }
		 */
		
		//while문은 무한루프에 빠질 위험이 많기 때문에 조심해야 한다
		/*
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		*/
		
		/* for문과 while문은 서로 변환이 가능하다
		 * for문은 반복 횟수를 알고 있을 때 주로 사용
		 * while문은 조건에 따라 반복할 때 주로 사용
		 */
		int i = 1;
		int sum = 0;
		while(i <= 100) {
			sum = sum + i;
			i++;
		}
		System.out.println("1부터 100까지의 합 : " + sum);
		
		/*
		 * do-while문
		 * 
		 * do{
		 * 	실행문
		 * } while(조건식);
		 * 
		 * 1. 실행문 실행
		 * 2. 조건식 평가
		 */
		
	}
}
