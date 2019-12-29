package day54_Polymorphisim;

//import static packagename.By.*    ==> "import static" is import all the static methods from given class

abstract class AbstractClass{
	
	public static void ByLinkText() {
	System.out.println("Link Text Super");	
	}
	
	public void get() {
		System.out.println("chrome");
	}
}





public class Test extends AbstractClass {

	public static void ByLinkText(int a) {
		System.out.println("Link Text Sub");
	}
	
	public void get() {
		System.out.println("firefox");
	}
	public static void Test() {
		
	}
	
	public static void main(String[] args) {
		
		Test.ByLinkText(10);
		//AbstractClass obj = new AbstractClass();
			//We cannot create object from abstract class.
		
		AbstractClass obj2 = new Test();
			obj2.ByLinkText();    //static methods cannot be overriden. So that it executes the Abstractclass(reference type's method) method!!  
			obj2.get();			//get method is instance method so that you could override it and when you execute it it uses the Test classes overriden method.
	
		Test obj3 = new Test();
			obj3.ByLinkText(10); //	
			
	
	}		
}
