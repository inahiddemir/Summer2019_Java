package day29_ReturnMethods;

import java.util.Arrays;

public class MethodOverloading {
/*
 	its a feature that allow us to have more yhan one method with the same name, but the methods MUST have different parameters
 
 */
	public static void main(String[] args) {
		int result = sum(5,3,8);
		System.out.println(result);
	
		int[] arr = {1,2,3,4,5};
		Sort(arr);
		
		char[] str = {'A','B','C','D'};   //DCBA
		Sort(str);
		
	}
	
	public static int sum(int a, int b) {
		return a*b;
	}
	
	public static int sum(int a, int b, int c) {
		return a+b;
	}

	// overload method example: the sort methods of Arrays class, it accepts all 
	
	// write a method called sort, that can sort an int array in descending order
	
	public static void Sort(int[] arr) {
									// [1,2,3,4,5}
		Arrays.parallelSort(arr);
		for(int i=arr.length-1; i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void Sort(char[] ch) {
	Arrays.sort(ch);
	for(int i=ch.length-1; i>=0; i--) {
		System.out.print(ch[i]+" ");
	}
		
	}

	public static void Sort(String[] arr) {
		
	}






}
