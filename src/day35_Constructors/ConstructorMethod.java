package day35_Constructors;

public class ConstructorMethod {
/*
 Every class MUST have constructor
 
 if we dont give the constructor, then compiler will give default constructor.
 
 declaration of constructor
 
 access-modifier  className()   
 
 Execution is depends on the creation of the object
 
 create object from a class:
 ClassName obj = new existingConstructor;
 
 constructor call:
 1.only a constructror can call another constructor
 2. constructors cannot be called by their name. We have to use "this()" keyword for call the constructor.
 3. constructor call has to be the first statement in constructor !!!!
 4. one constructor can ONLY call ONE constructor
 5. Constructor cannot call itself 
 6. Constructor cannot contain itself
 
 there is no return-type
 there is no specifier
 constructor name MUST be same with the class name
 
 */


public ConstructorMethod(int a) {
	this(10.5);
	System.out.println("Constructor with argument: "+a);
}

public ConstructorMethod(double a) {
//this(10.5);  // constructor cannot call itself or contain itself
	
	// this(10); //constructor cannot contain itself
	System.out.println("constructor with argumen: "+a);
 
}

public ConstructorMethod(boolean a) {
	
// COnstructorMethod(9);  //constuctor cannot be called by constructor name

	// System.out.println("constructor with argument of: "+a);
									//constructor has to be called first. Constructor call is the priority !!
	
	
	//this(100); // you can only call one constructor 
	this(10.5);
	System.out.println("constructor with argument of: "+a);
}





public static void main(String[] args) {
	//   ConstructorMethod obj = new ConstructorMethod("Hello");
												//the constructor is not exist
		
	// ConstructorMethod obj2 = new ConstructorMethod();
									//the constructor does not exist	
	
	ConstructorMethod obj = new ConstructorMethod(100);
	
	
	method1();
	
	//ConstructorMethod();
	
	ConstructorMethod obj4 = new ConstructorMethod(true);
	
	
}

public static void method1() {
	
}














}
