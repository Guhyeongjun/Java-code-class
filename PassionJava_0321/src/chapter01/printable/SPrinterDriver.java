package chapter01.printable;

public class SPrinterDriver implements Printable {
	
	@Override
	public void print(String doc) {
		System.out.println("방송 프린터 출력 ~");
	}

}
