package chapter02;

public class RestaurantList {
	private String resName;
	private String resLocation;
	private String resNumber;
	
	public void setRestaurantList(String resN, String resL, String resNum) {
		resName = resN;
		resLocation = resL;
		resNumber = resNum;
	}
	
	public void getRestaurantList() {
		System.out.println("맛집 이름 : " + resName);
		System.out.println("맛집 위치 : " + resLocation);
		System.out.println("맛집 전화번호 : " + resNumber);
	}
	
	public static void main(String[] args) {
		RestaurantList res = new RestaurantList();
		res.setRestaurantList("안쪽집", "부산 영도구", "010-1234-5678");
		res.getRestaurantList();
	}
	
}
