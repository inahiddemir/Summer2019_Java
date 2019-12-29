package day49_Recap;

public class Cylinder extends Shape {

	double radius;
	double height;
	final double PI = 3.14;
	
	
	public Cylinder (double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	protected void Area() {
		double Area = 2*PI*radius*height;
		System.out.println("Area of the cylinder is: "+Area);
	}
	
	protected void capacity() {
		double capacity = PI*radius*radius*height;
		System.out.println("Volume of the cylinder is: "+ capacity);
    }
	
	
}
