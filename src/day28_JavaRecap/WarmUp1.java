package day28_JavaRecap;

import java.util.Arrays;

public class WarmUp1 {
/* 1. write a method that can convert km to miles
 * 				1km = 0.612 miles
 * 
 * 2. write a methid that can convert gallons to litters
				1G = 3.75 L
				
   3. write a method that can print out the array in descending order 
 
 
 *
 *
 */				
	public static void main(String[] args) {
		KmToMiles(10);
		
		GallonToLiter(85.5);
	
		int[] arr = {10,20,30,40,50};
		
		SortDes(arr);
		
	}




	public static void KmToMiles(double KM) {
		double Miles = KM*0.612;
		System.out.println(KM+" km equals to "+Miles+" miles");
	}

	public static void GallonToLiter(double gallons) {
		double Liters = gallons*3.75;
		System.out.println(gallons+" gallons equals to "+Liters+" liters");
	}

	public static void SortDes (int[] array) {
		// array = {10, 8, 99, 0, -1];
		Arrays.sort(array);   // array = {-1, 0, 8, 10,99}
	
		for(int i=array.length-1; i>=0; i--) {
			System.out.print(array[i]+ " "); 
		}
	
	
	
	}










}
