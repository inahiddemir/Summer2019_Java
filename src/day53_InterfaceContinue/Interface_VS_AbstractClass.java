package day53_InterfaceContinue;

public interface Interface_VS_AbstractClass {

	// Access-modifier className(){}
	
	//public Interface_VS_AbstractClass() {}
	
	//public void mm() { }
	
	
	static int num = 300;
	
	//static{ }  //variables in interface are static and final bu default. Final variables cannot be reAssigned.
	//instance variables execution is depends on the object. In interface you cannot have objects.
	
	
	//abstract method is only way that the method does not have body!!
	public abstract void method1();
	public abstract int method2();
	
	void method(); //public
	
	//public access modifier is given by default in interface
	
	void method4(); //public 
	
	/*
	public default void mm() {
		
	}
	
	Only way you can give a body.. Its future topic. Predicate class and Lambda
	*/
	
	
	
	//protected absract void method5();
	// public protected abstract void method5();
	
	int a = 10;
	//(public final static) int a;  //by default

		public static void main(String[] args) {
			System.out.println(a); //static only accepts static
			
			System.out.println(Interface_VS_AbstractClass.a);
			
			
			//Interface_VS_AbstractClass obj = new Interface_VS_AbstractClass();
			//interface is not a class
			//abstraction is not concrete, but object has to be concrete
		}
}

class Test implements Interface_VS_AbstractClass{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int method2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}
	
}