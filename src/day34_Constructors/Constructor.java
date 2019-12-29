package day34_Constructors;

public class Constructor {
/*
 	methods:
 		access-modifier specifier return-type methodname(parameter){
 		
 		}
 	
 	Constructor is a very special method: 
 
 	declaration of constructor:
 	default constructor (constructor without args)
 
 		access modifier className(){
 			statements;
 			
 			
 	every single class must have a constructor, if we didnt give the constructor, then the compiler will give the default (no-arg) constructor
 	
 		constructors with argument
 		 
 		 access modifier className(parameters)
 		 	statements;
 	
 	Constructor cannot have return-type and specifier.
 	constructor name Must be same with the class name
 	
 	constructor calls:
 		only a constructor can call another constructor.
 	
 	constructor execution depends on the creation of the object
 	
 	create an object from a class:
 		className referenceName = new  existingConstructorMethod  
		
 */


	public Constructor() {
		System.out.println("Hello World");
				
	}
	
	
	
	
	public static void main(String[] args) {
	
		Constructor obj = new Constructor();


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
