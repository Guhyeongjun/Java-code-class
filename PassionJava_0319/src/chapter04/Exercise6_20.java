package chapter04;

public class Exercise6_20 {
	static int num;
	public static int max(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < arr[i + 1]) {
				num = arr[i+1];
				continue;
			} else if(arr[i] > arr[i+1]) {
				num = arr[i];
				continue;
			} 
	}
		return num;
}
	
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : " + max(data));
		System.out.println("최대값 : " + max(null));
		System.out.println("최대값 : " + max(new int[] {}));
	}
}
