package chapter01;

public class ConditionalOp {
	public static void main(String[] args) {
		//삼항 연산자
		//조건식(피연산자1)?값 또는 연산식(피연산자2): 값 또는 연산식(피연산자3)
		int score = 85;
		String grade = (score > 90)?"A":"B";
		System.out.println(score + "점은 " + grade + "등급입니다");
		
		
	}
}
