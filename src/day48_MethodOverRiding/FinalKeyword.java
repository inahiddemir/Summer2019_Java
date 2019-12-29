package day48_MethodOverRiding;

class Credentials{
	
	private final String UserName = "Cybertek";

	private final String PassWord = "Batch12";

	/*
	public void setUserName(String UserName) {			// UserName is defined woth final keyword you cannot SET it again !!
		this.UserName = UserName;
	}
	*/
	
	public String getUserName() {
		return UserName;								// but you can get thats OK
	}
	
	
}



class Holly{
	
	
	final public void printName() {
		System.out.println("Erhan");
	}
}



public class FinalKeyword extends Holly {

	/*
	@Override
	public void printName() {					//FINAL METHODS CANNOT BE OVERRIDED.
		System.out.println("Madina");
	}
	*/
	
	final int AGE = 100;
	
	public static void main(String[] args) {
		
		final String SSN = "123456"; // its constant from now on	//final variables should be assigned immediately
		
		// SSN = "654321"; 	//after the final keyword you cannot assign the variable again
		System.out.println(SSN);
		
		final String DateOFBirth;
		
		//System.out.println(DateOFBirth);
	
		FinalKeyword obj = new FinalKeyword();
		System.out.println(obj.AGE);
	
	}

		public final static void add(int a, int b) {
			System.out.println(a+b);
		}
		
		public static double add(double x, double y) {
			return x+y;										//final methods cannot be overrided but overloaded !!!
		}													// main method can be final





}
