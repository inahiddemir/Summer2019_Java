package day41_initializerBlocks;

public class staticBlock {

	public staticBlock() {
		System.out.println("Constructor");   //constructor execution depends on the creation of the object!!
	}
	
	public static void main(String[] args) {
		
		staticBlock obj1 = new staticBlock();
		staticBlock obj2 = new staticBlock();
		staticBlock obj3 = new staticBlock();
		staticBlock obj4 = new staticBlock();
		staticBlock obj5 = new staticBlock();
		
		System.out.println("main method");
	}
	
	
	
	static {
		System.out.println("static block A");          //static block executing FIRST!!		//static block execution does not depends on the object
		//System.out.println("static block B");
	}
	
	static {							
		System.out.println("static block C");		   //static block mainly used for initializing static variables..			
	}
}
