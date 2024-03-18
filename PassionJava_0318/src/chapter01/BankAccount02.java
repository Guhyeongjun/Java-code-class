package chapter01;
/*
 * 클래스 = 데이터 + 기능
 * 인스턴스 변수 - 클래스 내에 선언된 변수
 * 인스턴스 메소드 - 클래스 내에 정의된 메소드
 */
public class BankAccount02 {
	int balance = 0;
	//입금
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	//출금
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	//에금 조회
	public  int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
	public static void main(String[] args) {
		//클래스는 틀이다
		//클래스를 사용하기 위해서는 인스턴스 생성
		
		//클래스이름 변수이름(참조변수) = new 클래스이름();
		BankAccount02 ba = new BankAccount02();
		
		//두 개의 인스턴스 생성
		BankAccount02 yoon = new BankAccount02();
		BankAccount02 park = new BankAccount02();
		//각 인스턴스에 데이터 기능이 따로 존재 한다
		
		//윤님의 계좌
		yoon.deposit(5000);
		yoon.checkMyBalance();
		//박님의 계좌
		park.deposit(3000);
		park.checkMyBalance();
		
		//인스턴스를 대입하고 있는 변수 - 참조 변수
		//참조변수의 특성
		BankAccount02 kim = new BankAccount02();
		kim.deposit(4200);
		kim.checkMyBalance();
		BankAccount02 ref1 = kim;
		ref1.checkMyBalance();
	}
}
