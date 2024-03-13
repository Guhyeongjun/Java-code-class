package chapter01;

public class IntroduceMyself {
	public static void main(String[] args) {
		//자기 소개 및 좋아하는 것 5개를 다양한 변수 선언을 통해 콘솔에 출력하세요
		//목적 : 변수를 선언하고 사용
		
		//자기 소개 5개
		String name = "구형준";
		String region = "영도";
		String foot = "평발";
		String cafe = "신기산업";
		double tall = 172.3;
		int age = 21;
		int year1 = 21;
		int footSize = 265;
		
		
		System.out.println("|==================자기소개==================|");
		System.out.println("저의 이름은 " + name + "이고 키는 "  
							+ tall + "이고 나이는 " + age + "입니다");
		System.out.println("저는 " + region + "에서 태어나서 " + year1  
							+ "년 동안 " + region + "에 살고있습니다" );
		System.out.println("영도에는 유명한 카페 " + cafe + "이 있습니다");
		System.out.println("저는 발사이즈가 " + footSize 
				      + "이고 " + foot + "입니다");
		
		System.out.println();
		
		//좋아하는 과일
		String fruit = "복숭아";
		String taste1 = "달콤";
		String taste2 = "식감";
		//좋아하는 영화
		String movie = "메이즈러너";
		String name1 = "딜런 오브라이언";
		String name2 = "토마스 생스터";
		String name3 = "이기홍";
		String name4 = "카야 스코델라리오";
		String mood1 = "흥미진진";
		String mood2 = "긴장감";
		int size = 3;
		//좋아하는 게임
		String game = "리그오브레전드";
		String tier = "마스터";
		int champion = 167;
		int year2 = 10;
		//좋아하는 계절
		String season1 = "가을";
		String season2 = "여름";
		String season3 = "겨울";
		String weather1 = "선선";
		
		int number1 = 9;
		int number2 = 1;
		int number3 = 10;

		System.out.println("|=================좋아하는 과일=================|");
		System.out.println("제가 좋아하는 과일은 " + fruit + "입니다");
		System.out.println(fruit + "을 좋아하는 이유는 " + "우선 " + taste1 + "하고 "
							+ taste2 + "이 좋기 때문입니다");
		
		System.out.println();
		System.out.println("|=================좋아하는 영화=================|");
		System.out.println("제가 좋아하는 영화는 " + movie + "입니다");
		System.out.println(movie + "는 " + size + "의 시리즈로 제작 되었으며 " 
							+ name1 + "," + name2 + "," + name3 + "," + name4 + "등의 주인공이 등장합니다");
		System.out.println("제가 " + movie + "를 좋아하는 이유는 우선 분위기가 매우 " + mood1 
							+ "하고 " + mood2 + "이 넘치기 때문입니다");
		
		System.out.println();
		System.out.println("|=================좋아하는 게임=================|");
		System.out.println("제가 좋아하는 영화는 " + game + "입니다");
		System.out.println(game + "에는 챔피언이 " + champion + "개가 있습니다");
		System.out.println("저는 " + game + "라는 게임을 " + year2 + "년정도 플레이 하였으며 "
							+ "티어는 " + tier + "입니다");
		
		System.out.println();
		System.out.println("|=================좋아하는 계절=================|");
		System.out.println("제가 좋아하는 계절은 " + season1 + "입니다");
		System.out.println("제가 " + season1 + "을 좋아하는 이유는 우선 "
							+ season2 + "과 " + season3 + "사이에 있어 "
							+ "날씨가 " + weather1 + "하기 때문이다");
		
		System.out.println();
		System.out.println("|=================좋아하는 숫자=================|");
		System.out.println("내가 좋아하는 숫자는 " + number1 + "이다");
		System.out.println(number1 + "를 좋아하는 이유는 우선 내 이름에도 " + number1 + "가 들어간다");
		System.out.println("또 " + number1 + "와 " + number2 + "을 합치면 " 
							+ number3 + "이 된다는 점이 좋다");
		
		
		
		
	}
}
