package day29_ReturnMethods;

import java.util.Arrays;

public class practise2 {
	public static void main(String[] args) {
	
		int[] array = {1,2,3,4,5,6,7}; // 7 6 5 4 3 2 1
		
		array = Sort(array);
		System.out.println(Arrays.toString(array));
	}

	// write a method that accepts an int array and sorts it then return an array
	
	public static int[] Sort(int[] arr) {
						//[5,3,2,22,3]
		Arrays.sort(arr); //[2,3,3,5,22]
		int[] numbers = new int[arr.length]; //numbers array has same length with
		
		int z = 0;
		for(int i=arr.length-1; i>=0; i--) {
			numbers[i] = arr[z];
			z++;
		}
		return numbers;
	}
		
	



























}
