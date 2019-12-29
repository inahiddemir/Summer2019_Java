package day15_Scanner_StringClass;

import java.util.Scanner;

public class StringInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		String firstname = scan.next();
		
		System.out.println("Enter your last name: ");
		String lastname = scan.next();
		
		System.out.println(firstname + " "+ lastname);
		
	
	}
}

