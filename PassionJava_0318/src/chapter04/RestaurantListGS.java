package chapter04;

public class RestaurantListGS {
	private String resName;
	private String resLocation;
	private String resNumber;
	
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getResLocation() {
		return resLocation;
	}
	public void setResLocation(String resLocation) {
		this.resLocation = resLocation;
	}
	public String getResNumber() {
		return resNumber;
	}
	public void setResNumber(String resNumber) {
		this.resNumber = resNumber;
	}
	
	@Override
	public String toString() {
		return "RestaurantListGS [resName=" + resName + ", resLocation=" + resLocation + ", resNumber=" + resNumber
				+ "]";
	}
	
	public static void main(String[] args) {
		RestaurantListGS res = new RestaurantListGS();
		res.setResName("안쪽집");
		res.setResLocation("부산 영도구");
		res.setResNumber("010-1234-5678");
		System.out.println(res.toString());
	}
	
}
