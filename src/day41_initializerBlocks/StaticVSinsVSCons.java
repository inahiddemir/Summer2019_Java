package day41_initializerBlocks;

public class StaticVSinsVSCons {

	static {	
		System.out.println("static block");		//static block does not depend on the object
		// executed as soosn as the class is loaded, ONLY ONCE
		//	ONLY ONCE!!!
	}
	
	{
		System.out.println("instance block");
		//instance block execution depends on the object
	}
	
	public StaticVSinsVSCons() {
		System.out.println("Constructor");
		//constructor runs after the instance block
	}
	
	public static void main(String[] args) {
		StaticVSinsVSCons obj = new StaticVSinsVSCons();
		StaticVSinsVSCons obj2 = new StaticVSinsVSCons();
		StaticVSinsVSCons obj3 = new StaticVSinsVSCons();
		
	}












}
