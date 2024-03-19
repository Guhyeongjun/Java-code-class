package chapter03;

//static 키워드
//static 키워드는 의미만 아시고 사용 거의 안한다

public class InstCnt {
	int instNum = 1;
	static int instStaticNum = 0;
	
	public InstCnt(int instNum) {
		this.instNum = instNum;
	}
	
	@Override
	public String toString() {
		return "InstCnt [instNum=" + instNum + "]";
	}

	public static void main(String[] args) {
		//인스턴스 변수 instNum을 사용하기 위해서
		//인스턴스 생성 - 클래스 틀을 이용해 인스턴스를 만들어서
		//메모리에 올린다
		InstCnt instCnt = new InstCnt(42);
		System.out.println(instCnt.toString());
		//static 선언을 붙이면 클래스 변수 된다
		//static 의미는 바로 사용이 가능하게 메모리에 올린다
		
		//메소드 내부의 변수
		//메소드에 static 붙이면 클래스 메소드 메모리에 바로 적재되서 사용이 가능하다
		
		//enum - 나열되는 데이터 값
		
	}
}
