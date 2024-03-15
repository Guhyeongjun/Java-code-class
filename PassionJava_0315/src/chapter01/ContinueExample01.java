package chapter01;

public class ContinueExample01 {
	public static void main(String[] args) {
		//1에서 10사이의 수 중에서 짝수만 출력하는 코드
		for(int i = 1; i <= 10; i++) {
			if(i % 2 !=0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
