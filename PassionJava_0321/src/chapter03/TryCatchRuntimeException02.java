package chapter03;

public class TryCatchRuntimeException02 {
	
	public static void main(String[] args) {
		try {
			System.out.println("예외 발생 전 코드");
			int value1 = Integer.parseInt("a100");
			System.out.println("예외 발생 후 코드")	;		
		} catch(Exception e) {
			System.out.println("잘못된 형식 입니다.");
		}
	}
}
