package chapter01;

public class BreakExample01 {
	public static void main(String[] args) {
		/*
		 * break문
		 * - 반복문과 switch문에서 break문을 사용하여 종료합니다.
		 * 
		 * for(...){
		 * 	break; //종료
		 * }
		 */
		
		//주사위로 굴려서 나올 수 있는 하나의 수를 무작위로 뽑아서 출력하는 프로그램을 작성
		//임의의 정수를 뽑는다. Math.random() 메소드(함수) 활용
		//0.0과 1.0사이에 속하는 double 타입의 난수 하나 리턴
		
		//for문 1부터 100까지의 정수 중에서 3의 배수의 총합
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
