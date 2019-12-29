package day33_ArrayList;

public class MethodCalls {

	public static void main(String[] args) {
	method3();
	
	int max2 = max(10,20); //20
	
	System.out.println(max2);
	
	int max3 = max(100,200,50); //200
	
	System.out.println(max3);
	
	// double hello = 	maximum(400,50000,999999); you cannot assign this method to any primitive because method type is void !!!!!!!!!
	
	print(5,10,15);
	
	String str = print(10,20,30);
	System.out.println(str);
	}
	
	
	public static void method1() {
		System.out.println("A");
	}
	
	
	public static void method2() {
		
		method1(); //A
		System.out.println("B"); //B
	}
	
	public static void method3() {
		method2();// A B
		System.out.println("C"); //C
	}
	
	public static int max(int a, int b) {
		return (a > b)?a:b;
	}
	
	public static int max(int a, int b, int c) {
		
		//int largestNum = max(a,b);
		
		//return (largestNum > c) ? largestNum : c; 
	
		return(max(a,b) > c) ? max(a,b) : c;
	}
	
	public static int max(int a, int b, int c, int d) {
	
		return (max(a,b,c) > d) ? max(a,b,c) : d;
		
		/*
		 	or you can
		 	
		 	return max(a,b) > max(c,d) ? max(a,b) : max(c,d);
		 
		 */
	
	}
	
	public static int max(int a, int b, int c, int d, int e) {
		return max( max(a,b,c,d) , e );
		
		/*
		   or you can
		   
		   return max( max(a,b,c) , max(d,e) );
		   
		   
		 */
	}
	
	public static void maximum(int a, int b, int c) {
		System.out.println( max(a,b,c) );
	}
	
	
	public static String print (int a, int b, int c) {
		maximum(a,b,c);
		return "";
	}
	
	
	
	
	
	
	
	
}
