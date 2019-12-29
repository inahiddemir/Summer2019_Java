package day30_WrapperClass;

public class WrapperClassMethods {
	public static void main(String[] args) {
		// max_Value: returns the maximum vallue of primitive

	int maximum = Integer.MAX_VALUE;
	System.out.println(maximum);
	
	double maximumDouble = Double.MAX_VALUE;
	System.out.println(maximumDouble);
	
	byte maximumByte = Byte.MAX_VALUE;
	System.out.println(maximumByte);
	
	char maximumChar = Character.MAX_VALUE;
	System.out.println(maximumChar);
	
	char ch = 119;
	System.out.println(ch);
	
	// min_Value: returns the minimum value of primitive
	
	int minimum = Integer.MIN_VALUE;
	System.out.println(minimum);
	
	//parse methods: converts String values to primitives, return the value as primitive
	
	//parseInt("strValue"): takes the string and converts string to primitive
	
	Integer num1 = Integer.parseInt("123");
	System.out.println(num1+15);
	
	int num2 = Integer.parseInt("125");
	System.out.println(num2+15);
	
	// wrapper class to primitive =====> unboxing
	// primitive to wrapper clas ======> auto-boxing
	 
	//parseByte("strValue"): takes the string and convert it into Byte
	
	int numx = Byte.parseByte("19"); //there is no compile eroor because you can assign byte to int.
	System.out.println(numx+1);
	
	byte num3 = Byte.parseByte("18");      //auto-boxing
	System.out.println(num3+1);                  
	System.out.println(num3+200);
	
	//parseShort("strValue"): takes the string and auto bozing it short value
	
	
	
	
	
	
	
	}
}
