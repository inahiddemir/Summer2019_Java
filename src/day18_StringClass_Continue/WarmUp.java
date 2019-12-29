package day18_StringClass_Continue;
import java.util.Scanner;
public class WarmUp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		String first = scan.next();
		scan.nextLine();
		System.out.println("Please enter your last name: ");
		String last = scan.nextLine();
		
		//String initial = first.substring(0,1).concat(".")+last.substring(0,1);
		//String initial = first.substring(0,1)+"."+last.substring(0,1);
		String initial =""+first.charAt(0)+"."+last.charAt(0);  // you cannot assign char to string.
		
		
		
		initial = initial.toUpperCase();
	
		System.out.println(initial);
		
		int a = 'A'+'B';
		System.out.println(a);
		
		String lastletters =""+ first.charAt(first.length()-1)+"."+last.charAt(last.length()-1);
		lastletters = lastletters.toUpperCase();
		System.out.println(lastletters);
		
		
	}
}
