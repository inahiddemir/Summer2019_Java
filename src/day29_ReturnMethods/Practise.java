package day29_ReturnMethods;

public class Practise {
// write a method that give the longest word from tne array

	public static void main(String[] args) {
		
	}


	public static String longWord(String[] arr) {
		
		String longest = "";
		int max =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].length()>max)
				max = arr[i].length();
				longest = arr[i];
		}
			return longest;
	}





























}
