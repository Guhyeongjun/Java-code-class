package chapter04;

public class Exercise6_5 {
	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1, 1);
	}
}

class PlayingCard {
	int kind;
	int num;
	
	static int width;
	static int height;
	
	PlayingCard(int k, int n){
		kind = k;
		num = n;
	}
	
	//클래스 변수(static 변수) : width, height
	//인스턴스 변수 : kind, num
	//지역변수 : k, n
}
