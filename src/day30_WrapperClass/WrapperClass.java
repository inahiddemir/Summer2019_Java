package day30_WrapperClass;
import java.util.Arrays;
public class WrapperClass {
/*
 	Every primitive in java has a class thats designed to it. 
 	
 	primitives: byte, short, int, long, float, double, boolean, char
 	
 	wrapper classes: Byte, Short, Integer, Long, Float, Double, Boolean, Character
 */

	public static void main(String[] args) {
	
		char ch1 = 'L';
		Character ch2 = ch1; // Auto-Boxing
		
		char ch3 = ch1; // none
	
		char ch4 = ch2; // unboxing
		
		Character ch5 = ch2; //none
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		
		Boolean[] arr = new Boolean[3];  //[0,0,0];
		System.out.println(Arrays.toString(arr));
		
		int num1 = 10;
		// num1.method(); primitives does not have methods, variable num1 is not a 
		
		Integer num2 = 20; 
		int x = num2.MAX_VALUE;
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


}
