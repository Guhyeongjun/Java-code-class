package chapter02;

public class ArrayLength {
	public static void main(String[] args) {
		//배열 길이
		//배열에 저장할 수 있는 전체 항목의 개수
		int[] intArray = {10,20,30};
		System.out.println(intArray.length);
		
		String[] fruits = {"사과","바나나","배"};
		System.out.println(fruits.length);
		
		int[] intArr = new int[10];
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}
}
