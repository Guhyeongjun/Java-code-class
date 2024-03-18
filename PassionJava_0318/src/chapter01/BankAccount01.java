package chapter01;



public class BankAccount01 {
	public static void main(String[] args) {
		//클래스와 인스턴스
		/*
		 * 프로그램의 기본구성
		 * 데이터 - 프로그램상에서 유지하고 관리해야 할 데이터
		 * 기능 - 데이터를 처리하고 조작하는 기능
		 */
		
		//입금 진행
		deposit(10000);
		//잔액 확인
		checkMyBalance();
		//출금 진행
		withdraw(3000);
		//잔액 확인
		checkMyBalance();
		//수많은 사람이 통장을 발급 해야 되는데 이런 코드는 그런 상황에 적절하지 않다.
		//데이터 + 기능 = 클래스
	}
	//기능
	//입금
	static int balance = 0;
	
	public static int deposit(int amount) {
		balance += amount;
		return balance;
	}
	//출금
	public static int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

	//에금 조회
	public static int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
}
