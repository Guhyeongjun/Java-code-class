package chapter03;

public class Method02 {
	public static void main(String[] args) {
		hiEveryone(21,172);
		byEveryone();
		
	}
	
	
	//매개변수가 둘인 매소드의 정의
	public static void hiEveryone(int age, double height) {
		System.out.println("제 나이는 " + age + "세 입니다");
		System.out.println("제 몸무게는 " + height + "cm 입니다");
		
	}
	
	//매개변수(입력)가 없는 메소드의 정의
	public static void byEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}
}
