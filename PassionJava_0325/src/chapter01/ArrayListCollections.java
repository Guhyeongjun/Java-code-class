package chapter01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollections {
	
	public static void main(String[] args) {
		/*
		 * <제네릭>
		 * <> - 저장하고 싶은 클래스 타입을 넣는다
		 * - 길이가 가변이다
		 * 
		 * List 컬렉션을 구현하는 클래스
		 * ArrayList, LinkedList
		 */
		ArrayList<Integer> list1 = new ArrayList<Integer>(10);
		ArrayList<Integer> list2 = new ArrayList<>(10);
		List<String> slist = new ArrayList<>();
		
		//객체를 저장
		slist.add("JAVA");
		slist.add("JDBC");
		slist.add("JSA");
		
		//저장된 총 객체수 얻기 - size()
		System.out.println(slist.size());
		
		//인덱스를 이용한 객체 얻기 - get()
		System.out.println("0번째 인덱스 : " + slist.get(0));
		System.out.println("2번째 인덱스 : " + slist.get(2));
		
		for(int i = 0; i < slist.size(); i++) {
			System.out.println(slist.get(i));
		}
		
		//인덱스를 이용하여 객체 삭제 - remove()
		slist.remove(1); //JDBC 삭제
		for(String str:slist) {
			System.out.println(str);
		}
		
		ArrayList<Integer> list3 = new ArrayList<>();
		int num1 = 42;
		list3.add(num1);
		int num2 = list3.get(0);
		for(int i:list3) {
			System.out.println(i);
		}
		
		
	}
}
