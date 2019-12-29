package day27_ForEach;

public class VoidMethod {

	/*
	 	declaration of method : 
	 	access-modifier    specifier    return-type   methodname()   {}
	 
	 */

	
	// YOU CANNOT CREATE ANY METHOD WITH IN ANOTHER METHOD. YOU HAVE TO CREATE YOUR METHOD UNDER CLASS TITLE !!!!!!!!!!!!!
	
	// WE HAVE TO CALL THE METHODS BY THEIR METHODS NAME
	
	public static void main(String[] args) {
		
		myFirstMethod();
	
		even1To100();
		
	
	
	}
	
	
	
	public static void even1To100() {
		
		for(int i=0; i<100; i++) {
			if(i%2!=0) {
				continue;
			}
		System.out.print(i+" ");
		}
		
	}
	
	public static void myFirstMethod() {
	
	System.out.println("Hello World");
	System.out.println("Hello Cyvertek");
	System.out.println("Hello Khurshed");
	
}









}
