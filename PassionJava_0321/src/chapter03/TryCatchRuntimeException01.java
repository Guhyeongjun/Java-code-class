package chapter03;

public class TryCatchRuntimeException01 {
	public static void main(String[] args) {
		String data1 = null;
		try {
			System.out.println(data1.toString());
		} catch(Exception e) {
			System.out.println("null값이 대입되어 있습니다. 	");
		} finally {
			//예외가 발생 하든 안하든 항상 실행하는 블록이다
			System.out.println("finally 블록 코드");
		}
		System.out.println("프로그램 종료");
		
	
	}
}
