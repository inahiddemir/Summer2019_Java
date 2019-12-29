package day32_JavaReview;

public class WrapperClassReview {
/*
     primitives								Wrapper Classes : java.lang
  		byte									Byte
  		short		Auto Boxing 				Short
  		int		==========================>     Integer
  		long									Long
  		float									Float
  		double		Unboxing      				Double
  		boolean	 <=========================		Boolean
  		char									Char
  		
  		1. 		default values:
  					primitives: byte,short,int,long ==> 0
  							float,double ==> 0.0
  							boolean ==> false
  							char ==> space
  			
  					All wrapper class: null
  		
  		2. Wrapper class only accepts its own values
  		
  		3. wrapper classes have method, primitives dont
  		
  		4. wrapper class takes object, primitives take values
  		
  		methods: Max_values, Min_values, parse methods, valueof methods
  				max value: return the max value of data type
  				min value: return the min value of data type
  				parse methods: converts string to primitives
  				valueOf methods: converts string to 
  
 */

	public static void main(String[] args) {
//es		
		
		int a =10;
		Integer b = 10;	// Integer only accepts int primitive values
		byte c = 20;		
		// Integer b2 = c  //its wrong because Integer only accepts int primitive values
		
		long L = b; // Integer is within the range of long
		
		
		boolean result = 9>0+1;
		Boolean result2 = result;  //auto boxing;
		
		boolean result3 = result2; //un-boxing;
		
		Boolean result4 = result2; //none    wrapper to wrapper
		
		boolean result5 = result3; //none    primitive to primitive
		
		/*
		 methods:
		 
		  max_value
		  min_value
		  parse methods
		  valueof method
		   
		 
		 */
		
		int max = Integer.MAX_VALUE;
	//  int max = Double.MAX_VALUE;    // compile error because double cannot be assigned to int
		System.out.println(max);
		
		int mini = Integer.MIN_VALUE;
		System.out.println(mini);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		int min = Byte.MIN_VALUE;
		int min2 = Short.MIN_VALUE;
		
		System.out.println(min); 
		System.out.println(min2);
		
		//parse methods: using for converting string to primitives and ignores case sensitivity
		
		short s1 = Short.parseShort("1234");
		System.out.println(s1+1);
		
		double d1 = Double.parseDouble("78.5"); // none     (neither autoboxing nor un-boxing)
		
		Double d2 = Double.parseDouble("78.5"); // auto - boxing
		
		boolean r1 = Boolean.parseBoolean("TrUe");  //none   // anything except (ignoreCase) true; is false in this method.
		System.out.println(!r1);
	
		
	}
}
