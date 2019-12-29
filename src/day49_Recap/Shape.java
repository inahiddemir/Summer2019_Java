package day49_Recap;

/*
 11/05/2019
Topics:     Abstraction Intro
                    1. abstract methods
                    2. abstract class
                    3. abstract class vs regular class
Package: day49_Recap
class name: Shape
WarmUp: 
    1. create a class called Shape
            Actions: Area(), perimeter(), capacity()
    2. create sub classes of Shape:
                        Circle
                        rectangle
                        square
                        cylinder
        and give the instance variables that are needed to calculate the Area, perimeter, and Volume of those shapes
    3. override super class' Area(), perimeter(), capacity() methods to the sub classes
Formulas:
    Area of the circle:     3.14 * radius * radius
    Area of the rectangle:  width * length
    Area of the square:     side * side
    Area of the cylinder: (2 * 3.14 * radius * radius) + height(2*3.14*radius)
    Perimeter of circle:    3.14 * 2 * radius
    Perimeter of rectangle: (width + length) * 2
    Perimeter of Square: 4 * side
    perimeter of cylinder: 2 ( pi * D + h)
    volume of cylinder: 3.14 * radius * radius * height .  
remaining java topics:  Abstraction ( abstract method, abstract class, interfaces)
                        Polymorphisim
                        Exception handling
                        Collections
                    LocalDateTime
                    properyties file
override vs overload:
        overload: same method name, different parameter
                  return-type can be same or different
                  Access modifier can be same or different
                  can happen in same class
                  any method can be overloaded
        override: same method name, same parameter
                  return-type MUST be same
                  access modifiers need to be same or more visible
                  MUST be overridden in sub class
                  only the instance method can be override
                  access modifer cannot be private
                  final methods cannot be overridden
                  @Override annotation must be applicable

 */
public class Shape {
    
    protected void Area() {
        System.out.println("Area is 0");
    }
    
    protected void perimeter() {
        System.out.println("perimeter is 0");
    }
    
    protected void capacity() {
        System.out.println("volume is 0");
    }
    
    
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 20 );
                  rectangle1.Area();  //200.0
        
        Rectangle rectangle2 = new Rectangle(30, 40);
                rectangle2.Area();
                
                rectangle2.perimeter();
                rectangle2.capacity(); //0
                
        Square  square1 = new Square(10);
                square1.Area();  // 100
                square1.perimeter(); // 40
                square1.capacity();  //0
    
        
        Circle circle1 = new Circle(5);
        circle1.Area();
        circle1.perimeter();
        
        Cylinder cylinder1 = new Cylinder(2,5);
        cylinder1.Area();
        cylinder1.capacity();
        
    }
    
    
}
 
