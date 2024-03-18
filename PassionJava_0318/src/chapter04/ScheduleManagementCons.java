package chapter04;

public class ScheduleManagementCons {
	private String schedule;
	private String time;
	private String location;
	
	public ScheduleManagementCons(String schedule, String time, String location) {
		super();
		this.schedule = schedule;
		this.time = time;
		this.location = location;
	}

	@Override
	public String toString() {
		return "ScheduleManagementCons [schedule=" + schedule + ", time=" + time + ", location=" + location + "]";
	}
	
	public static void main(String[] args) {
		ScheduleManagementCons sc = new ScheduleManagementCons("미팅", "12:00 ~ 15:00", "서울 강남구");
		System.out.println(sc.toString());
	}
	
}
