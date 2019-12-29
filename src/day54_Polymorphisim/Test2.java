package day54_Polymorphisim;


interface Interface{
	
	abstract void get();
	
	static void nahid() {
		
	}
}

interface Interface2 extends Interface{
	abstract void frame();
}

abstract class AbsClass{
	
}


public class Test2 extends AbsClass implements Interface,Interface2 {

	public static void main(String[] args) {
		Interface obj = new Test2();
		obj.get();
	
		Interface2 obj2 = new Test2();
		obj2.frame();
		obj2.get();
		
		AbsClass obj3 = new Test2();
	
	}

	@Override
	public void get() {
		System.out.println("Chrome Browser");
	}

	@Override
	public void frame() {
		System.out.println("frame");
		
	}
	
	

}
