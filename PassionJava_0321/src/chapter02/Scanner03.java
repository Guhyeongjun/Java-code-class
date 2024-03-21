package chapter02;

import java.util.Scanner;

public class Scanner03 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택 > ");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.print("에금액 > ");
				int depositNum = sc.nextInt();
				balance += depositNum;
			} else if(num == 2) {
				System.out.print("출금액 > ");
				int withdrawNum = sc.nextInt();
				balance -= withdrawNum;
			} else if(num == 3) {
				System.out.println("잔고 > " + balance);
			} else if(num == 4) {
				break;
			}
			
		}
		System.out.println("프로그램 종료");
	}
}
