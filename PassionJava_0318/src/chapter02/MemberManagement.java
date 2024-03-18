package chapter02;

public class MemberManagement {
		private String name;
		private int age;
		private String gender;
		private String phoneNumber;
		
		public void setMemberManagement(String n, int a, String g, String p) {
			name = n;
			age = a;
			gender = g;
			phoneNumber = p;
		}
		
		public void getMemberManagement() {
			System.out.println("회원 이름 : " + name);
			System.out.println("회원 나이 : " + age);
			System.out.println("성별 : " + gender);
			System.out.println("전화번호 : " + phoneNumber);
		}
	
		public static void main(String[] args) {
			MemberManagement mem1 = new MemberManagement();
			mem1.setMemberManagement("김자바", 24, "남성", "010-1234-5678");
			mem1.getMemberManagement();
			
			System.out.println();
			
			MemberManagement mem2 = new MemberManagement();
			mem2.setMemberManagement("인어공주", 25, "여성", "010-432-4532");
			mem2.getMemberManagement();
			
		}
}
