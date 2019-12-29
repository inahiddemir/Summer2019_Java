package day38_CustomClassContinue;

public class Employee {

		String Name;
		String ID;
		int age;
		String SSN;
		String JobTitle;
		double salary;
		
		public Employee(String Name, String ID, int age) {
			this.Name = Name;
			this.ID = ID;
			this.age = age;
		}
		
		public void getInfo() {
			System.out.println("Employee name is: "+Name);
			System.out.println("Social Security Number is: "+SSN);
			System.out.println("Employee age is: "+age);
			System.out.println("Employee job title is: "+JobTitle);
			System.out.println("Employee ID is: "+ID);
			System.out.println("Salary "+salary);
			
			
		}
		
}
