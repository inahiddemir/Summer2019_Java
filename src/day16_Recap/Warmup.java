package day16_Recap;

import java.util.*;

public class Warmup {
	
	/* write a program that ask the user first and last name and write all of them in capital.
	 
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Please enter your first and last name: ");
		// System.out.println("Please enter your first name: ");
		String name = scan.nextLine();
		//System.out.println("Please enter your last name: ");
		String lastname = scan.nextLine();
		
		
		
		String fullname = name.concat(" "+lastname);
		
		name = name.toUpperCase();
		
		lastname = lastname.toUpperCase();
		
		//System.out.println(name+" "+lastname);
		
		System.out.println(fullname);
		
		
	}
}
