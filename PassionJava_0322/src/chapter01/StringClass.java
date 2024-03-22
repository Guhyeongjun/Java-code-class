package chapter01;

//String 클래스
//자바에서 문자열을 위한 클래스
//다른 언어에서는 문자열을  char 배열로 다룬다.
public class StringClass {
	
	public static void main(String[] args) {
		int[] intArr1 = {1,2,3};
		int[] intArr2 = intArr1;
		intArr2[0] = 42;
		for(int i = 0; i < intArr1.length; i++) {
			System.out.println(intArr1[i]);
		}
		
		//String 클래스의 다양한 메서드
		//int compareTo(String str)
		//문자열과 사전순서로 ㅂ교한다
		//같으면 0을, 사전순으로 이전이면 음수를, 이후면 양수를 반환한다
		
		//지정된 문자열이 포함되었는지 검사한다
		//boolean contains(CHarSequence s)
		
		//String replace(String old, String new)
		//문자열 중의 문자열을 새로운 문자열로 모두 바꾼 문자열을 반환한다
		String s = "What the hell";
		String s1 = s.replace("hell", "heaven");
		System.out.println(s1);
		
		//String[] split(String regex)
		//문지얄을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다
		//csv파일은 ,로 데이터를 구분한 파일
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		//foreach문
		//for(요소를 순차적으로 대입할 변수 : 시퀀스형 자료){
		//}
		//배열이 가지고 있는 요소 수 만큼 자동으로 반환
		for(String str : arr) {
			System.out.println(str);
		}
		
		//년-월-일, 성-이름
		//일-월-년, 이름-성
		//22-03-2024
		String today = "22-03-2024";
		String[] todays = today.split("-");
		String temp = todays[0];
		todays[0] = todays[2];
		todays[2] = temp;
		String ymd = "";
		int cnt = 0;
		for(String str1 : todays) {
			System.out.println(str1);
			ymd+=str1;
			if(cnt < 2) {
				ymd+="-";
			} 
				cnt++;
		}
		System.out.println(ymd);
		
		//join()은 여러 문자열 사이에 구분자를 넣어서 결합한다
		String ymd1 = String.join("-", todays);
		System.out.println(ymd1);
		//프레임워크 - 구조와 라이브러리가 이미 갖추어진 틀
	}
}
