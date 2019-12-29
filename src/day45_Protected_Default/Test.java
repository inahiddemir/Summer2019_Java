package day45_Protected_Default;

import day45_Inheritance.Protected_VS_Default;

public class Test extends Protected_VS_Default {
		//	  sub				//super
	
	// sub class can inherit protected and default features from super class!!!!
	
	/*
	 	protected String name;
	 	
	 	protected void printHello();
				System.out.println("Hello");
	 */
	//Test obj = new Test();
	
	public static void main(String[] args) {

	/*	
		Protected_VS_Default obj = new Protected_VS_Default();
	obj.printHello(); // protected access modifier is not visible outside of the package
	obj.printHola();     //default access modifier is not visible outside of the package
	
	System.out.println(obj.name); // protected access modifier is not visible outside package
	System.out.println(obj.id);   // default access modifier is not visible outside package
		
	default: not visible outside of the package
	protected: not visible outside of the package but can be inheritable	
	
	*/
	
	//Test obj = new Test();
	
	System.out.println(name);
	printHello();
	//System.out.println(id);    // only protected can be inherited outside the package not default (public already ok everywhere)
	
	
	
	}
}
