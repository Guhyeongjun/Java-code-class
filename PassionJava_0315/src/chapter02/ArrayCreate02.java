package chapter02;

public class ArrayCreate02 {
	public static void main(String[] args) {
		// new 연산자로 배열 생성
		// 타입 [] 변수 = new 타입[길이];
		// 길이 - 배열이 저장할 수 있는 값의 개수
		// 길이가 5인 int [] 배열을 생성
		
		int[] intArray = new int[5];
		int[] intArray1 = {0,0,0,0,0};
		
		for(int i = 0; i < 5; i++) {
			System.out.println(intArray1[i]);
		}
		
		String[] strArray = new String[3];
		for(int i = 0; i < 3; i++) {
			System.out.println(strArray[i]);
		}
		
		//클래스와 인터페이스 타입만 null 사용 가능
		//기본 데이터 타입에서는 null 사용이 불가능 하다
		
		int[] arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i = 0; i < 3; i++) {
			System.out.println(arr1[i]);
		}
		
		String[] arr2 = new String[3];
		arr2[0] = "1월";
		arr2[1] = "2월";
		arr2[2] = "3월";
		for(int i = 0; i < 3; i++) {
			System.out.println(arr2[i]);
		}
		
	}
}
