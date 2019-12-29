package day30_WrapperClass;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractise {
	public static void main(String[] args) {
	
		ArrayList<String> nameList = new ArrayList<>();  // arraylist does not support primitves, it only support class types.
		
		// add method:
				nameList.add("Homayra");
				nameList.add("Apple");
				
				System.out.println(nameList);
		
				/*
				   create an ArrayList called student names
				   create Scanner object called scan
				 */
				
				Scanner scan = new Scanner(System.in);
				ArrayList <String> studentNames = new ArrayList<>();
				
				while(true) {
				System.out.println("Enter a name");
				String name = scan.nextLine();
				studentNames.add(name);
				
				System.out.println("do you want to add anothedr name");
				String answer = scan.nextLine().toLowerCase();
				
				if(!(answer.equals("yes") || (answer.equals("no")))) {
					System.out.println("invalid");
					break;
				}
				if(answer.equals("no")) {
					break;
				}
				}
					System.out.println(studentNames);
	
	
	}
}
