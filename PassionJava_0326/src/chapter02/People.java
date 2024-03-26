package chapter02;

public enum People {
	MAN(29),WOMAN(25);
	
	int age;
	People(int age){
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "I am " + age + " years old";
	}
	
	public static void main(String[] args) {
		System.out.println(People.MAN);
		System.out.println(People.WOMAN);
	}
}
