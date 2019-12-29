package day25_ArraysContinue;

import java.util.Arrays;

public class StringMethods {

	/*split(str): splits the string by the given value and returns it as String array
	  
	  toCahrArray():
	 
	 */
	public static void main(String[] args) {
		
		String sentence = "Today is great day Good day to learn java";
		
		String[] arr = sentence.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String email = "Firstname_LastName";
		String[] arr2 = email.split("_");
		
		String str = Arrays.toString(arr2);
		System.out.println(str);
		System.out.println(str.replace("[", "").replace("]",""));
		
		String fullnamee = "Cybertek School Batch12";
		String[] array1 = fullnamee.split(" "); //there are 2 spaces
		System.out.println(Arrays.toString(array1));
		
		String java = "I love java and java is fun, java is life";
		//             I love   |  and   |  is fun,   |  is life								
		String[] array2 = java.split("java");
		System.out.println(Arrays.toString(array2));
		System.out.println(array2.length-1); // how much "java" you have
		
		String Phyton = " Phyton is good, I love Phyton, Phyton is life ";
		String[] array3 = Phyton.split("Phyton");
		System.out.println(array3.length-1); // returns the total number of "Phyton" in string
		
		String emailAddress = "Cybertek.school.batch12@Gmail.com";
		emailAddress = emailAddress.substring(0, emailAddress.indexOf("@"));
		String[] arrayy = emailAddress.split(".");
		System.out.println(Arrays.toString(arrayy));
		
		String word = "ABCDEFG";
		String[] wordarray = word.split(""); // all characters from the string as an array
		System.out.println(Arrays.toString(wordarray));
		
		String strr = "Java";
		char[] ch = strr.toCharArray();
		
		System.out.println(Arrays.toString(ch));
		
		
	}
}
