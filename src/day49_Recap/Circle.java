package day49_Recap;

public class Circle extends Shape{

	double radius;
	double diameter = radius*2;
	final double PI = 3.14;
	
	public Circle(double radius) {
			
		this.radius = radius;
		diameter = radius*2;
	}

	protected void Area() {
		double Area = radius*radius*PI;
		System.out.println("Area of the circle is: "+Area);
	}
	
	protected void perimeter() {
		double perimeter = PI*diameter;
		System.out.println("Perimeter of the circle is: "+perimeter);
	}
	



}
