package day27_ForEach;

public class VoidMethod_WithArgument {
// you need to write
//access-modifier    specifier    return-type   name(parameter){}

	public static void oddOrEven(int a) {
		if(a%2==0) {
			System.out.println(a+" is Even Number");
		} else {
			System.out.println(a+" is Odd Number");
			
		}
	}
	
	public static void main(String[] args) {
		oddOrEven(50);
	
		int z = 100;
		
		oddOrEven(z);   // variable z value will be assigned to parameter variable
		
			
	
	
	
	}

}
