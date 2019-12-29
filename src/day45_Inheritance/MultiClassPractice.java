package day45_Inheritance;

class Data{
	public String name;
	private String age;
	String ID;
	protected String DOB;
	
	public void Hello() {	//public
		System.out.println("Hello");
	}

	private void Hola() {	//private
		System.out.println("Hola");
	}

	void Aloha() {		//default
		System.out.println("Aloha");
	}


}

public class MultiClassPractice {
	
	public static void main(String[] args) {
		Data obj = new Data();
		System.out.println(obj.name);  // public is visible to everywhere
		//System.out.println(obj.age);  //privae is not visible outside of the class
		System.out.println(obj.ID); // default access modifier is visible to classes in the same package
	
		// if those 2 classes are located in 2 different packages, then the default access modifier is not able to visible
	
		obj.Hello();
		//obj.Hola();
		obj.Aloha();
		
		
		
		
		
	}
}
