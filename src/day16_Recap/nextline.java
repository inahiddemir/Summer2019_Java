package day16_Recap;
import java.util.Scanner;
public class nextline {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your phone number: ");
		 int pn = scan.nextInt();
		 // 911 enter
		
		 System.out.println(pn);
		 
		 scan.nextLine();  // this allows you to enter your name
		 
		 System.out.println("Enter your name: ");
		 String name = scan.nextLine();
		 
		 
	}
}
			