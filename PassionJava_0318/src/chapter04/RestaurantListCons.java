package chapter04;

public class RestaurantListCons {
	private String resName;
	private String resLocation;
	private String resNumber;
	
	public RestaurantListCons(String resName, String resLocation, String resNumber) {
		super();
		this.resName = resName;
		this.resLocation = resLocation;
		this.resNumber = resNumber;
	}

	@Override
	public String toString() {
		return "RestaurantListCons [resName=" + resName + ", resLocation=" + resLocation + ", resNumber=" + resNumber
				+ "]";
	}
	
	public static void main(String[] args) {
		RestaurantListCons res = new RestaurantListCons("안쪽집", "부산 영도구", "010-1234-5678");
		System.out.println(res.toString());
	}
	
}
