package chapter04;

public class Exercise6_18 {
	public static boolean isNumber(String str) {
		for(int i = 0; i < str.length(); i++) {
			char num = str.charAt(i);
		}
		return false;
		
	}
	
	
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}
}
