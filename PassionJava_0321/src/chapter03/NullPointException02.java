package chapter03;

public class NullPointException02 {
	private NullPointException01 npe;
	
	public NullPointException01 getNpe() {
		return npe;
	}

	public void setNpe(NullPointException01 npe) {
		this.npe = npe;
	}

	public void sayHello() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		NullPointException02 npe2 = new NullPointException02();
		npe2.sayHello();
		npe2.getNpe().toString();
	}
}
