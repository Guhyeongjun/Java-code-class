package chapter03;

public class TopException {
	
	public static void main(String[] args) {
		try {
			int num = 10 / 0;
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다");
		} 
	
	}
}
