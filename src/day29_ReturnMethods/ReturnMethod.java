package day29_ReturnMethods;

public class ReturnMethod {
/*
 	
 		if the method type is void : the method does not return any value
 		 but if the method type is return type:  the method must return a value
 
 *		return type must match with the data type that you defined first while creating the method.
 *		
 *		the method bidy must be closed with return statement
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

	public static void main(String[] args) {
	String str = name();
		System.out.println(str);
		
		/*name(); //this is a String value
		// "Batch12"
		System.out.println(name());
		*/
	}
	
	public static boolean result() {
		return true; // or you can write return 8>9
	
	}
		
	public static void method1() {
		System.out.println("Hello");
		return;
	}
	
	public static String name() {   // return type is String!!
		return "Batch12";
		// System.out.println("ashjkdkalsjfsakdf");   // this line is unreachable, because with the return statement, you ended the method. 
		// Once return method statement executed, it exits the method immediately
	}

	














}
