package chapter04;

public class AccountBookGS {
	private String list;
	private int spend_money;
	private int all_money;
	
	public String getList() {
		return list;
	}
	public void setList(String list) {
		this.list = list;
	}
	public int getSpend_money() {
		return spend_money;
	}
	public void setSpend_money(int spend_money) {
		this.spend_money = spend_money;
	}
	public int getAll_money() {
		return all_money;
	}
	public void setAll_money(int all_money) {
		this.all_money = all_money;
	}
	
	
	
	@Override
	public String toString() {
		return "AccountBookGS [list=" + list + ", spend_money=" + spend_money + ", all_money=" + all_money + "]";
	}
	public static void main(String[] args) {
		AccountBookGS acc1 = new AccountBookGS();
		acc1.setList("음식");
		acc1.setSpend_money(15000);
		acc1.setAll_money(15000);
		
		AccountBookGS acc2 = new AccountBookGS();
		acc2.setList("백화점");
		acc2.setSpend_money(45000);
		acc2.setAll_money(60000);
		
		System.out.println(acc1.toString());
		System.out.println(acc2.toString());
	}
}
