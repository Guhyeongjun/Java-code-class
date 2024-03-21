package chapter02;

import java.util.Scanner;

public class Scanner02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1.이름 : ");
		String str1 = sc.next();
		
		System.out.print("2.주민번호 앞 6자리 : ");
		int str2 = sc.nextInt();
		
		System.out.print("3.전화번호 : ");
		String str3 = sc.next();
		
		System.out.println();
		
		System.out.println("1.이름 : " + str1);
		System.out.println("2.주민번호 앞 6자리 : " + str2);
		System.out.println("3.전화번호 : " + str3);
	}
}
