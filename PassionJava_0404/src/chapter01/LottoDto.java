package chapter01;

import java.util.ArrayList;

//로또 번호 한개
public class LottoDto {
	//private int[] nums = new int[6];
	//자바의 기본 배열은 길이가 고정이고 기본 기능이 부족하여
	//컬렉션을 쓴다
	private ArrayList<Integer> lottonums = new ArrayList<>();

	public ArrayList<Integer> getLottonums() {
		return lottonums;
	}

	public void setLottonums(ArrayList<Integer> lottonums) {
		this.lottonums = lottonums;
	}

	//로또 번호 한세트 출력 메소드
	@Override
	public String toString() {
		String str = "";
		for(int i:lottonums) {
			str += " ";
		}
		return "LottoDto [lottonums=" + lottonums + "]";
	}
	
	
}
