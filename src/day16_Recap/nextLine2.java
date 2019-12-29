package day16_Recap;

import java.util.Scanner;

public class nextLine2 {
	public static void main(String[] args) {
		/*
		 	write a program that accepts zip-code; city, state and phone number.
		 
		 	DO NOT USE NEXT METHOD!
		 */
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your zip-code: ");
		int zipcode = input.nextInt();
		//23456 Enter
		
		input.nextLine();      // if you don write this, program not working because it assigns the "enter button" after you write your
		// phone number, to the name
		
		
		System.out.println("Please enter your city name: ");
		String city = input.nextLine();
		
		System.out.println("Enter your phone number: ");
		int pn = input.nextInt();
		
		input.nextLine(); // takes out the "enter" after the pn
		
		System.out.println("Enter your state name: ");
		String state = input.nextLine();
		
		System.out.println("zip code is: "+zipcode);
		System.out.println("city name is: "+city);
		System.out.println("phone number is: "+pn);
		System.out.println("State name is: "+state);
	
	}
}
