package day26_ForEach;
import java.util.Arrays;

import javax.sound.midi.Soundbank;
public class ForEach {
	/* for each loop: used for access the value in a collection of values
	it's a loop thats already been iterated. 
	for each loop can never be infinite loop
	
	syntax: 
			for(DataType each: ArrayName){
			
			}
	*/
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		for (int i=0; i<arr.length; i++) {
			arr[i]=i+1;	
			System.out.println(arr[i]);
		}
	
		System.out.println("========================================================");
		
		for(int each : arr) {
			System.out.println(each);
		}
	
	String[] str1 = {"A", "B", "C", "D", "E", "F"};
	
	for(String each : str1) {          // it execute the length time of the collection
		System.out.print(each+" ");
	}
	System.out.println();
	                    
	char[] ch = {'z','x', 'y','c','a','b'};
	
	Arrays.sort(ch);
	
	for(char charzzz : ch) {
		System.out.println(charzzz);
	}
	
	int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
	for(int varname : arr1) {
		if (varname%2==0)
			System.out.print(varname+" ");
	}
	System.out.println();
	for (int helavela : arr1) {
		if(helavela%2==1)
			System.out.print(helavela+" ");
	}
	
	
	
	
	
	
	
	
	
	
	
	}
}
