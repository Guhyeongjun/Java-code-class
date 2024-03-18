package chapter02;

public class Contact {
	private String name;
	private String phoneNumber;
	private String email;
	
	public void setContact(String n, String p, String e) {
		name = n;
		phoneNumber = p;
		email = e;
	}
	
	public void getContact() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("이메일 : " + email);
	}
	
	
	
	public static void main(String[] args) {
		Contact contact = new Contact();
		contact.setContact("김자바", "010-1234-5678", "kimjava@naver.com");
		contact.getContact();
		
		System.out.println();
		
		Contact contact2 = new Contact();
		contact2.setContact("홍길동", "010-3432-3653", "hongildong@naver.com");
		contact2.getContact();
	}
}
