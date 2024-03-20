package chapter03;

public class ArrIns {
	public static void main(String[] args) {
		String str = "string";
		String[] strArr = {"s1","s2","s3"};
		ArrIns[] arr1 = new ArrIns[3];
		//상속 관계는 있는 인스턴스들도 상위 배열 참조 변수에 담을 수 있다
		Product[] pArr = new Product[3];
		pArr[0] = new Product();
		
	}
}
