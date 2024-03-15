package chapter01;

public class BreakExample02 {
	public static void main(String[] args) {
		//break 키워드, 예약어, 문
		/*
		for(int i = 0; i < 10; i++) {
			System.out.println("java");
		}
		*/
		
		//while문을 이용해서 주사위 번호 중 하나를 반복적으로 무작위로 뽑되 6이 나오면 while문을 종료
		
		while(true) {	
			int arr[] = new int[100];
			for(int i = 0; i < arr.length; i++) {
				int num = (int)(Math.random() * 100) + 1;
				arr[i] = num;
				if(arr[i] == 6) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
		
	}
}
