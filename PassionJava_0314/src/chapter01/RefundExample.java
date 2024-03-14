package chapter01;

public class RefundExample {
	public static void main(String[] args) {
		//동백패스 제도를 보고, 한달 쓴 금액을 변수로 지정하여 얼마 환급을 받을 수 있는지 if문으로 작성해 보세요
		
		int useMoney; // 한달 쓴 금액
		
		useMoney = 57450; 
		
		if(useMoney < 45000) {
			System.out.println("환급이 불가능합니다");
		} else if(useMoney >= 45000 && useMoney < 90000) {
			System.out.println("환급 가능 금액 : " + (useMoney - 45000) + "원");
		} else if(useMoney >= 90000) {
			System.out.println("환급 가능 금액 : 45000원, 최대 45000원까지 환급이 가능합니다 !!");
		}
		
	}
}
