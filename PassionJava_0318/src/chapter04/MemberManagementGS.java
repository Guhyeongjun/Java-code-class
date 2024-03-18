package chapter04;

public class MemberManagementGS {
	private String name;
	private int age;
	private String gender;
	private String phoneNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "MemberManagementGS [name=" + name + ", age=" + age + ", gender=" + gender + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	public static void main(String[] args) {
		MemberManagementGS mem1 = new MemberManagementGS();
		mem1.setName("김자바");
		mem1.setAge(24);
		mem1.setGender("남성");
		mem1.setPhoneNumber("010-1234-5678");
		System.out.println(mem1.toString());
		
		MemberManagementGS mem2 = new MemberManagementGS();
		mem2.setName("인어공주");
		mem2.setAge(25);
		mem2.setGender("여성");
		mem2.setPhoneNumber("010-432-4532");
		System.out.println(mem2.toString());
	}
	
}
