package day42_OOP_Encapsulation;

public class quiz {

	static String studentName = "Erhan";
	
	{
		studentName = "Hooly";
	}
	
	static {
		studentName = "Almaz";
	}
	
	public quiz() {
		studentName = "Bekir";
	}
	
	static {
		studentName = "Juline";
	}
	
	public static void main(String[] args) {
		quiz obj = new quiz();
		System.out.println(studentName);
	}
	
	
	
	
	
	
	
	
	
}
