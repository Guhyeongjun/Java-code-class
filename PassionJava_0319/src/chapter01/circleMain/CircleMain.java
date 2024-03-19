package chapter01.circleMain;

//import 문서에 포함을 의미
import chapter01.circle.Circle;

public class CircleMain {
	
	public static void main(String[] args) {
		Circle c1 = new Circle(42);
		//다른 패키지의 클래스를 가져오는 방법
		//1. import
		//2. 패키지명을 붙여 주는 방법
		
		
		
		//패키지
		//원의 넓이를 구하는 클래스
		//배포하게 되면 라이브러리
		//동일 이름의 클래스 파일을 같은 위치에 둘 수 없다
		
		//패키지 선언에 따른 문제 해결
		//서로 다른 패키지의 두 클래스는 인스턴스 생성 시 사용하는 이름 다르다
		
		//패키지 이름 규칙
		//모두 소문자로 구성
		//인터넷 도메인 이름의 역순으로 이름을 구성
		//이름 끝에 클래스를 정의한 주체 또는 팀의 이름 추가
	}
}
