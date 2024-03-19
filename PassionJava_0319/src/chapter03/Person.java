package chapter03;

public class Person {
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0) {
			System.out.println("나이는 음수를 입력할 수 없습니다.");
			return;
		}
		this.age = age;
	}
	
	
}
