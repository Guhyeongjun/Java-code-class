package chapter04;

public class ContactCons {
	private String name;
	private String phoneNumber;
	private String email;
	
	public ContactCons(String name, String phoneNumber, String email) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	@Override
	public String toString() {
		return "ContactCons [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	
	public static void main(String[] args) {
		ContactCons con1 = new ContactCons("김자바", "010-1234-5678", "kimjava@naver.com");
		System.out.println(con1.toString());
		ContactCons con2 = new ContactCons("홍길동", "010-3432-3653", "hongildong@naver.com");
		System.out.println(con2.toString());
		
	}
	
}
