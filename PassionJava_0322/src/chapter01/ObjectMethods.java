package chapter01;

//유용한 클래스
//Object 클래스
//모든 클래스의 최고 상위 클래스
//Object 클래스의 멤버들은 모든 클래스에서 바로 사용 가능
//인스턴스(멤버 변수)변수는 없고 메서드만 가지고 있다

//Object 클래스의 메서드 - equals()
/*
 * public boolean equals(Object obj){
 * 		return (this==obj);
 * }
 */
//매개변수로 객체의 참조변수를 받아서 비교하여 그 결과를 boolean 값으로 알려 주는 역할을 한다
public class ObjectMethods {
	private int value;
	
	public ObjectMethods(int value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		ObjectMethods om1 = new ObjectMethods(10);
		ObjectMethods om2 = new ObjectMethods(10);
		
		if(om1.equals(om2))
			System.out.println("om1과 om2는 같습니다");
		else
			System.out.println("om1과 om2는 다릅니다");
		//equals 메서드는 주소값으로 비교를 하기 때문에
		//value 값이 10으로 서로 같을지라도 결과가 false
		
		System.out.println(om1);
		System.out.println(om2);
		
		ObjectMethods om1copy = om1;
		if(om1.equals(om1copy))
			System.out.println("om1과 om1copy는 같다");
	}
}
