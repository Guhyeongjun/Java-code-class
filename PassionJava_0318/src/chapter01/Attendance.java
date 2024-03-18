package chapter01;

//출석 관리 프로그램
public class Attendance {
	private String studentName;
	private String enterRoomTime;
	private String leavingRoomTime;
	
	public void setAttendance(String s, String e, String l) {
		studentName = s;
		enterRoomTime = e;
		leavingRoomTime = l;
	}
	
	public void getAttendance() {
		System.out.println("훈련생 이름 : " + studentName);
		System.out.println("입실 시간 : " + enterRoomTime);
		System.out.println("퇴실 시간 : " + leavingRoomTime);
	}
	
	public static void main(String[] args) {
		Attendance att = new Attendance();
		att.setAttendance("김자바", "08:30", "16:50");
		att.getAttendance();
	}
}
