package day06_ArithmaticOperators;

public class PrimitivesCasting {
	
	/*
	 casting : converting the larger primitive to smaller size.
	 
	 castings: Explicit & Implicit
	 
	 primitives : byte, short, int, long, float, double
	 
	 Explicit Casting:
	 */
	public static void main(String[] args) {
		
		int a = 10;
		byte b = (byte) a; // Explicit casting
		
		System.out.println(b);
		
		double DecimalNumber = 10.5;
		float FloatNumber = (int) DecimalNumber; //double>float
		System.out.println(FloatNumber);
		
		
		long LongNum = 300L;
		
		int IntNum = (short)LongNum;
		System.out.println(IntNum);
		
		// Implicit Casting:
		
		byte ByteNum = 100;
		int IntNum2 = ByteNum;	
		// same with:
		int IntNum3 = (int) ByteNum; // you dont need to use paranthesis, system do it automatically.
		
		short ShortNum = 100;
		long LongNum2 = ShortNum;
		// same with:
		long LongNum3 = (long)ShortNum;
		
		// EXPLICIT CASTING PRACTISES:
		
		double LargestNumber = 100.8765;
		
		float FloatValue = (float)LargestNumber;
		float FloatValue2 = (int)LargestNumber;
		float FloatValue3 = (byte)LargestNumber;
		float FloatValue4 = (short)LargestNumber;
		float FloatValue5 = (long)LargestNumber;
		
		//System.out.println(FloatValue);
		//System.out.println(FloatValue2);
		//System.out.println(FloatValue3);
		//System.out.println(FloatValue4);
		//System.out.println(FloatValue5);
		
		float FloatNumber2 = 500.76f;
		
		int myNumber =(int) FloatNumber2;
		System.out.println(myNumber);
		
		
	}
	
	
	
	
	

}
