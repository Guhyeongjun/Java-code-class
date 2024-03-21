package chapter03;

//다중 catch
//try 블록 내부는 다양한 예외가 발생할 수 있다
//예외별로 예외 처리 코드를 다르게 작성 가능
//
public class CatchByExceptionKind {
	
	public static void main(String[] args) {
		try {
			int[] intArr = new int[3];
			intArr[10] = 10;
			int num = 10 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 예외");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없다");
		}
	}
}
