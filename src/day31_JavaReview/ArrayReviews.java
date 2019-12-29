package day31_JavaReview;

import java.util.Arrays;

public class ArrayReviews {
	
	/*
	   Array: store multiple data to a variable
	   Array's size is fixed
	 */
	public static void main(String[] args) {
		
		int num = 10;
		
		//declaration of array
		
		int[] arr = {10}; // array has size of 1 = [10]
		
		arr[0] = 20; //[10,20]
	
		System.out.println(arr[0]);    //if you do System.out.println(arr[1]) ==> it will give you compile error because you ll be Index out of bound
		
		//initializing the array size:
		
		int [] arr2 = new int[2]; // [0,0]  maximum capacity of array is 2
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
		String[] cars = new String[5]; // this array can contain 5 string values
		// {Tesla, Audi, Toyota, Jeep, Subaru}
		
		cars[4] = "Subaru";
		cars[2] = "Toyota";
		cars[1] = "Audi";
		cars[3] = "Jeep";
		cars[0] = "Tesla";
		
		for(int i=0; i<=cars.length-1;i++) {
			System.out.print(cars[i]+" ");
		}
		
		System.out.println();
		
		cars = new String[10];
		
		cars[5] = "Ford";
		
		for(int i = 0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");
		}
		System.out.println();
		boolean[] bool = {true, false, 10==10};
		
		boolean b1 = bool[2];
		System.out.println(b1);
	// Arrays.toString(bool)  ==>  conerts 1D array to string
		System.out.println(bool);
		
		String str = Arrays.toString(bool);
		System.out.println(str);
		
		// Arrays.sort() : sorts the array in ascending order
		
		double[] dArray = {1000, 900, 800, 700, 600};
		
		Arrays.sort(dArray);
		System.out.println(Arrays.toString(dArray));
		 int[] numbers = {40,200,7890,-9,20,-100};
		 
		 Arrays.sort(numbers);
		 
		 String result = "";
		 for(int i=numbers.length-1; i>=0; i--) {
			 result+=numbers[i]+", ";
		 }
		System.out.println(result);
		 // lets try to get rid of the ", " en of result string
		
		result = result.trim(); // this will help us to get rid of space at the end of result
		
		result = result.substring(0,result.lastIndexOf(","));
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
