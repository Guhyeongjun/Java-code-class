package chapter02;

public class ScheduleManagement {
	private String schedule;
	private String time;
	private String location;
	
	public void setScheduleManagement(String s, String t, String l) {
		schedule = s;
		time = t;
		location = l;
	}
	
	public void getScheduleManagement() {
		System.out.println("스케줄 : " + schedule);
		System.out.println("시간 : " + time);
		System.out.println("장소 : " + location);
	}
	
	public static void main(String[] args) {
		ScheduleManagement sc = new ScheduleManagement();
		sc.setScheduleManagement("미팅", "12:00 ~ 15:00", "서울 강남구");
		sc.getScheduleManagement();
	}
}
