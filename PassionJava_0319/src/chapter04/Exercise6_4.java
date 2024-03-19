package chapter04;

public class Exercise6_4 {
	static double getDistance(int x, int y, int x1, int y1) {
		double a = Math.pow(x1 - x, 2); // (x1 - x)의 제곱
		double b = Math.pow(y1 - y, 2); // (y1 - y)의 제곱
		double sum = a + b;
		return Math.sqrt(sum); // 루트 sum
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
	}
}
