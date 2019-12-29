package day29_ReturnMethods;

import java.util.Arrays;

public class ReturnPractises {
	public static void main(String[] args) {
		sum(10,20);
			
		System.out.println(addition(10,20));
	
		int num = addition(10,20);
		System.out.println(num);
		System.out.println(greaterNumber(5,10,15));
		
		int max = (int)greaterNumber(90,20,30);
		System.out.println(max);
		
		int[] arr = {20,30,1,3,5,9};
		int maxNum = maximum(arr);
		System.out.println(maxNum);
	
		int[] arr2 = {10000,90000,823112, 762112, 654312};
		int maxNum2 = maximum(arr2);
		System.out.println(maxNum2);
	
	}



	public static void sum (int a, int b) {
		System.out.println(a+b);
	}

	public static int addition(int a, int b) {
		return a+b;
	}
	
	// write a method tha accept 3 numbers and return the largest one
	
	public static double greaterNumber(int a, int b, int c) {
	
		int[] arr = {a,b,c};
		Arrays.sort(arr);
		return arr[2];
		
	}

//			write a method that accepsts int array and returns the max number
	public static int maximum(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}












}
