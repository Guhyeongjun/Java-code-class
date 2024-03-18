package chapter02;

public class AccountBook {
	private String list;
	private int spend_money;
	private int all_money;
	
	public void setAccountBook(String l, int s, int a) {
		list = l;
		spend_money = s;
		all_money = a;
	}
	
	public void getAccountBook() {
		System.out.println("지출 목록 : " + list);
		System.out.println("지출 금액 : " + spend_money);
		System.out.println("총 지출 금액 : " + all_money);
	}
	
	
	
	public static void main(String[] args) {
		AccountBook ab = new AccountBook();
		ab.setAccountBook("음식", 15000, 15000);
		ab.getAccountBook();
		
		System.out.println();
		
		ab.setAccountBook("백화점", 45000, 60000);
		ab.getAccountBook();
	}
}
