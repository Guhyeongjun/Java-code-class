package chapter03;

public class GetterSetter {
	private String name;
	private String phoneNumber;
	
	//Getter Setter
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}


	public static void main(String[] args) {
		//DTO(Data Transfer Object), VO(Value Object) 클래스들은
		//두가지 방법으로 값을 초기화
		//1. 생성자 사용
		//2. Getter Setter 사용
		GetterSetter gs = new GetterSetter();
		gs.setName("김자바");
		gs.getName();
		
	}
}
