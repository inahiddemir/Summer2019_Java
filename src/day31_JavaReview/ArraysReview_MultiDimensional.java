package day31_JavaReview;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReview_MultiDimensional {

	/*
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
	// ask user to assign 3 numbers then find the max and min
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers would you like to add?");
		int number = scan.nextInt();
		int[] arr = new int[number];
		
		/*
		System.out.println("Enter a number: ");
		arr[0] = scan.nextInt();
	
		System.out.println("Enter a number: ");
		arr[1] = scan.nextInt();
	
		System.out.println("Enter a number: ");
		arr[2] = scan.nextInt();
	*/
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter a number: ");
			arr[i] = scan.nextInt(); // user input
		}
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[2];
		
		System.out.println("Min is: "+arr[0]+" and Max is: "+arr[2]);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
