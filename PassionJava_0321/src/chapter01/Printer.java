package chapter01;

//인터페이스를 구현하는 클래스
//미완성의 메소드를 완성하셔야 됩니다
public class Printer implements Printable{
	//구현하는 메소드와 추상 메소드 사이에는 메소드 오버라이딩 관계가 성립
	//@Override 붙일 수 있음(생략 가능)
	public void print(String doc){
		System.out.println(doc);
	}
	
	public void colorPrint(String doc){
		System.out.println(doc);
	}
	
	public static void main(String[] args) {
		//인터페이스형 참조변수는 구현하는 클래스의 인스턴스를 참조 가능
		Printable prn;
		prn = new Printer();
		Printable prn1 = new Printer();
		
		//상속과 구현 동시에 가능하다
		//구현은 다중 구현이 가능하다
	}
}
