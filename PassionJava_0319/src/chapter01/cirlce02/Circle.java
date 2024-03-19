package chapter01.cirlce02;

public class Circle {
	
		double rad;
		final double PI;
		
		public Circle(double r) {
			rad = r;
			PI = 3.14;
			
		}
		
		public double getPerimeter() {
			return (rad*rad)*PI;
		}
}