package chapter04;

public class Exercise6_21 {
	public static int abs(int value) {
		if(value > 0) {
			value = value;
		} else if(value < 0) {
			value = value * -1;
		}
		return value;
	}
	
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값 : " + abs(value));
		value = -10;
		System.out.println(value + "의 절대값 : " + abs(value));
	}
}
