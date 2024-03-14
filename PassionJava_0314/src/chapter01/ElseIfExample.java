package chapter01;

public class ElseIfExample {
	public static void main(String[] args) {
		/* else if문
		 * 
		 * if(조건문1) {
		 * 	실행문A
		 * } else if(조건문2) {
		 * 	실행문B
		 * } else if(조건문3) {
		 * 	실행문C
		 * } else {
		 * 	실행문D
		 * }
		 */
		int score = 75;
		if(score >= 90) {
			System.out.println("등급이 A입니다");
		} else if(score >= 80) {
			System.out.println("등급이 B입니다");
		} else if(score >= 70) {
			System.out.println("등급이 C입니다");
		} else if(score >= 60) {
			System.out.println("등급이 D입니다");
		} 
		
	}
}
