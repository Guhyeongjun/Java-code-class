package chapter01;

//인스턴스 변수에 값을 처음 대입 하기 위해 초기화를 위한 매소드 정의
//값을 처음 대입 - 초기화
//생성자 매소드(constructor method)
// - 초기화 매소드를 대신하는 생성자
// - 
public class BankAccount03 {
	
	/*생성자 매소드
	 * 1. 생성자의 이름은 클래스의 이름과 동일해야 한다
	 * 2. 생성자는 값을 반환하지 않고 반환형도 표시하지 않는다
	 */
	
	String accNumber; // 계좌번호
	String ssNumber; // 주민번호
	int balance; // 예금 잔액
	
	public BankAccount03(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	
	public static void main(String[] args) {
		//생성자 호출
		//인스턴스 생성시 생성자를 호출한다
		BankAccount03 b1 = new BankAccount03("12-23-89","990099-493204" , 1100000);
		//변수에 직접 접근 하는 것은 개체 지향 언어의 정보은닉에 위배 되는 행위이기 때문에 금지 한다
		
	}
}
