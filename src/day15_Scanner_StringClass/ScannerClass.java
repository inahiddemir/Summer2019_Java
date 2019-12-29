package day15_Scanner_StringClass;

import java.util.Scanner;

/*
 	package name: java.util
 	class name: Scanner
 	import statement should be placed under the package and outside of the class
 	
 	wild import: import java.util.*
 	// wild import, import all the classes within java utils package.
 */
public class ScannerClass {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in); //(System.in)--> let the user give input using with keyboard
			
			System.out.println("Please enter byte value: ");
			byte num = input.nextByte();
			System.out.println("Please enter short value: ");
			short num2 = input.nextShort();
			
	}
}
