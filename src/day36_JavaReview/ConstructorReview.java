package day36_JavaReview;

public class ConstructorReview {
/*
 
  Constructors: special method, used when we create an object of class
  Every class must have a constructor 
 if we dont create any constructor, then compiler will give default constructor
  
  
  creating object:
  		ClassName obj = new 
  
  		only the given constructor gets executed
  
  
  
  declaration of constructor:  //if the constructor does not have any arguments that is default constructor
  		default constructor:
  
  		access-modifier		className()
  
  		constructor with arguments:
  		access-modifier		className(parameters)
 */

	
public ConstructorReview() {
	System.out.println("default constructor");
}
	
public ConstructorReview(int a) {
	System.out.println("Constructor with argument ");
}


	
	
	
	
	public static void main(String[] args) {
	
	ConstructorReview obj = new ConstructorReview();
	
	ConstructorReview obj2 = new ConstructorReview(10);
	
	
}


























}
