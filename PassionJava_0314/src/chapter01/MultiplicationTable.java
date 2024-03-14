package chapter01;

public class MultiplicationTable {
	public static void main(String[] args) {
		// 모든 단 세로로 출력
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
		}
		/* 세로로 한 단 씩 출력
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(j + " x " + i + " = " + i*j + " ");
				if(j == 9) {
					System.out.println();
				}
			}
		}
		*/
	}
}
