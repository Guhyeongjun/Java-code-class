package chapter02;

public class UserVariable4 {
	public static void main(String[] args) {
		// 1. 직사각형의 넓이를 구하는 코드 작성
		// 직사각형 넓이 공식 : 가로 * 세로
		int rectangleWidth; // 직사각형 가로
		int rectangleLength; // 직사각형 세로
		
		// 자신이 원하는 직사각형의 가로와 세로 길이 정하기
		rectangleWidth = 5;
		rectangleLength = 7;
		System.out.println("1. 직사각형의 넓이 : " + rectangleWidth * rectangleLength);
		
		// 2. 직사각형의 둘레를 구하는 코드 작성
		// 자신이 원하는 직사각형의 가로와 세로 길이 정하기
		rectangleWidth = 6;
		rectangleLength = 8;
		System.out.println("2. 직사각형의 둘레 : " + (rectangleWidth + rectangleLength) * 2);
		
		// 3. 반지름을 이용하여 원의 둘레를 구하는 코드 작성
		// 원의 둘레 공식 : (2 * π * 반지름)
		double circleRadius; // 원의 반지름
				
		// 자신이 원하는 원의 반지름 정하기
		// π는 3.14로 정함
		circleRadius = 3.4;
		System.out.println("3. 원의 둘레 : " + (2 * 3.14 * circleRadius));
		
		// 4. 삼각형의 넓이를 구하는 코드 작성
		// 삼각형 넓이 공식 : 0.5 * 밑변 * 높이
		int triangleBase; // 삼각형 밑변
		int triangleLength; // 삼각형 높이
				
		// 자신이 원하는 삼각형 밑변 높이 정하기
		triangleBase = 5; // 삼각형 밑변
		triangleLength = 6; // 삼각형 높이
		System.out.println("4. 삼각형의 넓이 : " + (0.5 * triangleBase * triangleLength));
		
		// 5. 삼각형의 길이 구하는 코드 작성
		// 삼각형의 길이 공식 : 일반 삼각형(A + B + C) : 3변 더하기 , 정삼각형(3 * 한 변)
		int triangleA;
		int triangleB;
		int triangleC;
		int regularTriangleLength;
		
		// 자신이 원하는 일반 삼각형 길이 정하기
		triangleA = 5;
		triangleB = 6;
		triangleC = 7;
		
		// 자신이 원하는 정삼각형 길이 정하기
		regularTriangleLength = 8;
		System.out.println("5. 일반 삼각형 길이 : " + (triangleA + triangleB + triangleC));
		System.out.println("5. 정삼각형 길이 : " + (3 * regularTriangleLength));
		
		// 6. 정사각형의 넓이를 구하는 코드 작성
		// 정사각형 넓이 공식 : 한변의 길이 x 한번의 길이
		int squareSide; // 정사각형 한변의 길이
		
		// 자신이 원하는 정사각형 넓이 정하기
		squareSide = 8; //
		System.out.println("6. 정사각형의 넓이 : " + squareSide * squareSide);
		
		// 7. 정오각형의 둘레를 구하는 코드 작성
		// 정오각형 둘레 공식 : 한 변의 길이 * 변의 수(5)
		int regularPentagonSide; // 정오각형 한 변의 길이
		int sideNumber; // 정오각형 변의 수 
		
		// 자신이 원하는 정오각형 변의 길이와 변의 수 정하기
		regularPentagonSide = 4;
		sideNumber = 5;
		System.out.println("7. 정오각형의 둘레 : " + regularPentagonSide * sideNumber);
		
		// 8. 정칠각형의 둘레를 구하는 코드 작성
		// 정칠각형 둘레 공식 : 한 변의 길이 * 변의 수(7)
		
		int regularHeptagonSide; // 정칠각형 한 변의 길이
		
		// 자신이 원하는 정칠각형 변의 길이와 변의 수 정하기
		regularHeptagonSide = 8;
		sideNumber = 7;
		System.out.println("8. 정칠각형의 둘레 : " + regularHeptagonSide * sideNumber);
		
		// 9. 정팔각형의 둘레를 구하는 코드 작성
		// 정팔각형 둘레 공식 : 한 변의 길이 * 변의 수(8)
		
		int regularOctagonSide; // 정팔각형 한 변의 길이
		
		// 자신이 원하는 정팔각형 변의 길이와 변의 수 정하기
		regularOctagonSide = 4;
		sideNumber = 8;
		System.out.println("9. 정팔각형의 둘레 : " + regularOctagonSide * sideNumber);
		
		// 10. 오늘 지급받은 3권의 교재의 총 페이지수를 구하는 코드 작성
		// 총 페이지수 공식 : 프로그래밍 언어 활용 페이지수 + 개발자 환경 구축 페이지수 + 정보능력 페이지수
		
		int programingPageNumber;
		int developerPageNumber;
		int informationPageNumber;
		
		// 3권의 페이지 수 입력
		programingPageNumber = 74;
		developerPageNumber = 70;
		informationPageNumber = 83;
		System.out.println("10. 3권의 총 페이지 수 : " + (programingPageNumber+developerPageNumber+informationPageNumber));
		
	}
}
