package day41_initializerBlocks;
/*
	Declaration of instance block is depends on the object.
	
	instance block executed BEFORE the constructor
	
	
*/
public class instanceBlock {
	{
		System.out.println("instance block1");
	}
	
	{
		System.out.println("instance block2");
	}
	
	{
		System.out.println("instance block3");
	}

	public instanceBlock() {
		System.out.println("Constructor");
	}
	
public static void main(String[] args) {
	instanceBlock obj = new instanceBlock();       //ins cons
	instanceBlock obj2 = new instanceBlock();	   // ins cons	
	instanceBlock obj3 = new instanceBlock();      //ins cons
	


}


}
