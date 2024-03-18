package chapter04;

public class ContactGS {
	private String name;
	private String phoneNumber;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "ContactGS [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	
	public static void main(String[] args) {
		ContactGS con1 = new ContactGS();
		con1.setName("김자바");
		con1.setPhoneNumber("010-1234-5678");
		con1.setEmail("kimjava@naver.com");
		System.out.println(con1.toString());
		
		ContactGS con2 = new ContactGS();
		con2.setName("홍길동");
		con2.setPhoneNumber("010-3432-3653");
		con2.setEmail("hongildong@naver.com");
		System.out.println(con2.toString());
	}
	
	
}
