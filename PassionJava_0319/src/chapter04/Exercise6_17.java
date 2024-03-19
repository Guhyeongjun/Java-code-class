package chapter04;

public class Exercise6_17 {
		
	public static int[] shuffle(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 9) + 1;
			for(int j = 0; j < i; j++) {        // 중복제거
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		return arr;
		
	}
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}
