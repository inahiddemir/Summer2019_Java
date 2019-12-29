package day22_NestedLoop;

import java.util.Scanner;

public class WarmUp2 {
	public static void main(String[] args) {
		/*
		 	Write a program that can check if the string is planindrome. IF its "true", otherwise "false"
		 					DO NOT USER FOR LOOP
		 				REVERSED AND THE ORIGINAL STRING ARE THE SAME FOR EXAMPLE = LEVEL, ABBA..
		 */
	
	// NAHID SOLUTION
	/*===============================================================================================================	
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Whats word: ");
	String str = scan.nextLine();
	int len = str.length();
	String rev = "";
	int i=len-1;
	while(i>=0) {
		rev += str.charAt(i);
		i--;
	}
		
	System.out.println(rev);
	
	if(str.equals(rev))
		System.out.println(true);
	else
		System.out.println(false);
	
	//=====================================================================================================================
	*/
	//MUHTAR SOLUTION
	//=====================================================================================================================
	
	String original = "ey edip adanada pide ye ";
	original = original.trim();
	// index:          0123456
	// rev index:      6543210
	
	String reverse = "";
	
	for(int i = original.length()-1;             i>=0;                       i--) {
	//	  initialization						condition					iterator
	
	
	reverse+=original.substring(i,i+1);
	}
	boolean result = original.contentEquals(reverse)? true : false;
	System.out.println(reverse);
	System.out.println(result);
	//======================================================================================================================
	}
}
