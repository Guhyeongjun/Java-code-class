package chapter04;

//매소드 오버로딩
//호출된 매소드를 찾을 때 참조하게 되는 두 가지 정보
// - 매소드의 이름
// - 매소드이 매개변수 정보
//매소드의 이름이 같을 때는 컴파일 에러 발생
//두가지 경우에는 허용 한다
//1. 매개변수의 수가 다르다
//2. 매개변수의 타입이 다르다

//매소드 오버로딩
//매소드 이름이 같지만 매개 변수의 수와 형을 다르게 하는 것
public class MyHome {
	
	
	
	public void mySimpleRoom(int n) {
		System.out.println(n);
	}
	
	public void mySimpleRoom(int n1, int n2) {
		System.out.println(n1);
		System.out.println(n2);
	}
	
	public static void main(String[] args) {
		MyHome myHome = new MyHome();
		myHome.mySimpleRoom(15);
	}
}
