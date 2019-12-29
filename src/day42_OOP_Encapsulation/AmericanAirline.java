package day42_OOP_Encapsulation;

public class AmericanAirline {
	
	public static void main(String[] args) {
	
		EmployeeInfo emrah = new EmployeeInfo();
			//emrah.name = "Emrah"; //name is private so that you got compile error
			
		emrah.setName("Emrah");
		System.out.println(emrah.getName());	
		
		emrah.setSSN(56434654);
		System.out.println(emrah.getSSN());
		
		emrah.setAge((byte)32);
		System.out.println(emrah.getAge());
		
		emrah.setSalary(120000);
		System.out.println(emrah.getSalary());
		
		System.out.println();
		
		EmployeeInfo Shirin = new EmployeeInfo();
		
		System.out.println(Shirin.getName());  // null  //because each object has its own instance variables
		System.out.println(Shirin.getSSN());
		System.out.println(Shirin.getAge());
		System.out.println(Shirin.getSalary());
		
		Shirin.setName("Shirin");
		Shirin.setSSN(87465);
		Shirin.setAge((byte)30);
		Shirin.setSalary(100000);
		
		System.out.println();
		
		System.out.println(Shirin.getName());  
		System.out.println(Shirin.getSSN());
		System.out.println(Shirin.getAge());
		System.out.println(Shirin.getSalary());
		
		System.out.println();
		
		EmployeeInfo Rohan = new EmployeeInfo();
		
		Rohan.setInfo("Rohan", 987987, (byte)20, 150000);
		
		System.out.println(Rohan.getName());  
		System.out.println(Rohan.getSSN());
		System.out.println(Rohan.getAge());
		System.out.println(Rohan.getSalary());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
