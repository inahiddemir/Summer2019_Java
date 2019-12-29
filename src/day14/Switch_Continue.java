package day14;

public class Switch_Continue {
	public static void main(String[] args) {
		
		// switch does not accept double, boolean, double, float or long !!!!!
		
		// homework : solve the https problem using witch switch
		
		String day="Sunday";
		
		switch (day) {
		
		case "Monday":
		case "Tuesday":
			System.out.println("Java Class");
			break;
			
		case "Wednesday":
		case "Saturday":
			System.out.println("SQL Class");
			break;
			
		case "Thursday":
		case "Friday":
			System.out.println("Selenium");
			break;
			
		default:
			System.out.println("Day Off");

		}
	}
}
