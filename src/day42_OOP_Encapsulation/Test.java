package day42_OOP_Encapsulation;

public class Test {
	public static void main(String[] args) {
		
		TestData obj = new TestData();
		//System.out.println(obj.Name);   because name is private in "TestData" class
		
		System.out.println(obj.getName());

		String str = obj.getName();
		//System.out.println(obj.ID); //private data so that you get compile error
			
		System.out.println(obj.getID());
		
		int a = obj.getID();
		
		obj.setName("Nahid");
		System.out.println(obj.getName());
		
		obj.setID(400);
		System.out.println(obj.getID());
		
		
		
	}
}
