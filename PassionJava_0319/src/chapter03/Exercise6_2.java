package chapter03;

public class Exercise6_2  {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
		
	}
}

class Student {
	public String name;
	public int ban;
	public int no;
	public int kor;
	public int eng;
	public int math;
	
	public Student(String n, int b, int no, int k, int e, int m) {
		this.name = n;
		this.ban = b;
		this.no = no;
		this.kor = k;
		this.eng = e;
		this.math = m;
	}
	
	public String info() {
		return name + "," + ban + "," + no + "," + kor + ","
				 + eng + "," + math;
	}
	
}
