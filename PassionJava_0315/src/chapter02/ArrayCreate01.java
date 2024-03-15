package chapter02;

import java.util.Arrays;

public class ArrayCreate01 {
	public static void main(String[] args) {
		/*
		 * 배열
		 * - 배열은 같은 타입의 데이터를 연속된 공간에 나열하고
		 * 각 데이터에 인덱스를 부여해놓은 자료구조
		 * - 변수는 1개의 데이터만 저장
		 * - 저장해야 할 데이터의 수가 많아지면 
		 * 그만큼 많은 변수가 필요하고 코드도 매우 길어진다
		 * - 많은 양의 데이터를 적은 코드로 손쉽게 처리할 수 있는 배열(array)이 있다
		 * 
		 * 1. 배열은 같은 타입의 데이터만 저장할 수 있다
		 * 2. 한 번 생성된 배열은 길이를ㄹ 늘리거나 줄일 수 없다
		 */
		
		int array[];
		double doublearray[];
		String name[];
		
		//콘솔에 사과 딸기 바나나 순으로 출력해 보세요
		String str[] = {"사과","딸기","바나나"};
		System.out.println(Arrays.toString(str));
		
		int [] scores = {82,90,87};
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		//모든 정수의 합
		for(int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		
		System.out.println("모든 정수의 합 : " + sum);
		
		String [] colors = {"검정색","빨간색","녹색","파란색"};
		//colors 배열에서 사용할 수 있는 인덱스 값의 범위 : 0 ~ 3	
		System.out.println(colors);
	}
}
