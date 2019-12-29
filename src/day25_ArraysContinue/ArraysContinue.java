package day25_ArraysContinue;

import java.util.Arrays;

public class ArraysContinue {
	public static void main(String[] args) {
		 int num1 = 10;
		 System.out.println(num1);
		 
		 int[] arr = {1,2,3};
		 System.out.println(arr);
	
		 /*
		   to print entire array as whole, we need to convert the array to string
		  	Arrays.toString (variable name)
		  
		  Arrays class: Utility of all arrays
		  
		  Arrays class is presented in java.util.Arrays class
		  
		  
		  
		  

		  */
	 String str = Arrays.toString(arr);
		 System.out.println(str);
	
		 String[] names = {"Elvira", "Bibish", "Tural", "Daulet", "Hakan"};
		 System.out.println(names[0]);
		 System.out.println(Arrays.toString(names));
	
		 String hey = Arrays.toString(names);
		 
		 for(int i=0;i<hey.length();i++) {
			 System.out.print(hey.charAt(i)+" ");
		 }
		 System.out.println();
	
		 /*
		  	Arrays.sort(variable name) = sort the values of arrays in ascending order (smallest to largest)
		  */
	
		 int[] numbers = {9,8,100,3000,4,5,6};
		 Arrays.sort(numbers);
		 System.out.println(Arrays.toString(numbers));
		 System.out.println("Maximum: "+numbers[numbers.length-1]);
		 System.out.println("Minimum: "+numbers[0]);
		 
		 String[] nameList = {"Alma","Enes","Myra","Smith","Lexi", "Ab"};
		 Arrays.sort(nameList);                       // it follows the alphabetical order in ascii table
		 System.out.println(Arrays.toString(nameList));
		 
		 char[] ch = {'0','9','8','5','3','2','1'};
		 System.out.println(ch);
		 Arrays.sort(ch);
		 System.out.println(Arrays.toString(ch));
		 
		 int[] nums = {2000,90,89,78,65,5555,444,-5};
		 Arrays.sort(nums);
		 System.out.println(Arrays.toString(nums));
	
		 for(int k=nums.length-1; k>=0; k--) {
			 System.out.print(nums[k]+" ");
		 }
		 System.out.println();
		 int[] arr2 = {99,10,200,3000,40,50,5000};
		 Arrays.sort(arr2); // array will be sorted in ascending order
		 int[] decending = new int[arr2.length];
		/*
		 decending[0] = arr2[6];
		 decending[1] = arr2[5];
		 decending[2] = arr2[4];
		 decending[3] = arr2[3];
		 decending[4] = arr2[2];
		 decending[5] = arr2[1];
		 decending[6] = arr2[0];
	*/
 
		 int z =0;
		 for(int i=arr2.length-1; i>=0; i--) {
			 decending[z] = arr2[i];
			 z++;
		 }
		 
		 System.out.println();
		 System.out.println("Ascending order: "+Arrays.toString(arr2));
		 System.out.println();
		 System.out.println("Decending order: "+Arrays.toString(decending));
	}
}
