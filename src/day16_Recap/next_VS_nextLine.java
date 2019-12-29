package day16_Recap;

import java.util.Scanner;

public class next_VS_nextLine {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter your first name: ");
	String f = scan.next();
	
	System.out.println("Enter yout last name: ");
	String l = scan.nextLine();
	
	System.out.println("Your first name is: "+f);
	System.out.println("Your last name is: "+l);
	
	// next: only accepts one word, nextline: you can even assign the whole sentence.
	
	}
}
             