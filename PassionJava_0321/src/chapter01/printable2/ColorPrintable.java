package chapter01.printable2;

//인터페이스의 상속
//인터페이스간 상속도 extends 표현
public interface ColorPrintable extends Printable{
	public void printCMYK(String doc);
	//기존 클래스 수정할 필요 없음
}
