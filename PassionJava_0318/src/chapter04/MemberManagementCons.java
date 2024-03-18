package chapter04;

public class MemberManagementCons {
	private String name;
	private int age;
	private String gender;
	private String phoneNumber;
	
	public MemberManagementCons(String name, int age, String gender, String phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "MemberManagementCons [name=" + name + ", age=" + age + ", gender=" + gender + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	public static void main(String[] args) {
		MemberManagementCons mem1 = new MemberManagementCons("김자바", 24, "남성", "010-1234-5678");
		System.out.println(mem1.toString());
		MemberManagementCons mem2 = new MemberManagementCons("인어공주", 25, "여성", "010-432-4532");
		System.out.println(mem2.toString());
		
	}
	
}
