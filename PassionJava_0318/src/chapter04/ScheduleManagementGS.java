package chapter04;

public class ScheduleManagementGS {
	private String schedule;
	private String time;
	private String location;
	
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "ScheduleManagementGS [schedule=" + schedule + ", time=" + time + ", location=" + location + "]";
	}
	
	public static void main(String[] args) {
		ScheduleManagementGS sc = new ScheduleManagementGS();
		sc.setSchedule("미팅");
		sc.setTime("12:00 ~ 15:00");
		sc.setLocation("서울 강남구");
		System.out.println(sc.toString());
	}
}
