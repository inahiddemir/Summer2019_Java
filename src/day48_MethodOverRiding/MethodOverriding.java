package day48_MethodOverRiding;

class student{
	
	public void printName() {
		System.out.println("Hakan");
	}
	
	
	
}

public class MethodOverriding extends student{

	public void print(String str) {
		
	}
	
	public void print(double a) {
		
	}
	
	//public void print(String str) {	}  OverRiding cannot happen in the same class !!!
	
	public void printName() {  // green triangle on the left of "25" is showing that this method is override
		System.out.println("Sukran");
	}
	
	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();
		obj.printName();	//Hakan
		
		student obj2 = new student();
		obj2.printName();	//Hakan but I want this obj print me "Sukran"
	}
	
	
	
}
