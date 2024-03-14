package chapter01;

public class SwitchExample {
	public static void main(String[] args) {
		/*
		 * switch문
		 * 
		 * switch(변수){
		 * 	case 값1:
		 * 		실행문A
		 * 		break;
		 * 	case 값2:
		 * 		실행문B
		 * 		break;
		 * 	default:
		 * 		실행문C
		 * }	
		 */
		
		int num1 = 1;
		switch(num1) {
			case 1:
				System.out.println("num1 : " + num1);
				break;
			case 2:
				System.out.println("num1 : " + num1);
				break;
			case 3:
				System.out.println("num1 : " + num1);
				break;
			default:
		}
		
		//breal 키워드(keyword, 예약어)는 조건문의 실행을 완전히 끝낸다.	
	}
}
