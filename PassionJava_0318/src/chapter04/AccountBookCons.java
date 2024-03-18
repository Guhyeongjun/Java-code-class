package chapter04;

public class AccountBookCons {
	private String list;
	private int spend_money;
	private int all_money;
	
	public AccountBookCons(String list, int spend_money, int all_money) {
		super();
		this.list = list;
		this.spend_money = spend_money;
		this.all_money = all_money;
	}

	@Override
	public String toString() {
		return "AccountBookCons [list=" + list + ", spend_money=" + spend_money + ", all_money=" + all_money + "]";
	}
	
	public static void main(String[] args) {
		AccountBookCons acc1 = new AccountBookCons("음식", 15000, 15000);
		AccountBookCons acc2 = new AccountBookCons("백화점", 45000, 60000);
		System.out.println(acc1.toString());
		System.out.println(acc2.toString());
	}
}
