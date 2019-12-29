package day18_StringClass_Continue;
import java.util.Scanner;
public class WarmUp2 {
	public static void main(String[] args) {
		
		String A1 = "Batch 12 is a great batch";
		
		int num = A1.indexOf("g");
		System.out.println(num);
		
		int num2 = A1.indexOf("a");
		System.out.println(num2);
		
		int num3 = A1.indexOf("eat");    // it will return the first character!!
		System.out.println(num3);
		
		int num4 = A1.indexOf("eat"+2);   // you will get -1.. That means there is no such index in the line.
		System.out.println(num4);
	
		String B1 = "today is tuesday, today we have class in the afternoon";
		int num5 = B1.indexOf("te");
		System.out.println(num5);
	
		String Address = " 7925 Jones Branch Dr, Mclean, VA 22003";
		int beginIndex = Address.indexOf(", M")+1+1;
		int endIndex = Address.indexOf(", V");
		String city = Address.substring(beginIndex,endIndex);
		System.out.println(city);
	
		String email = "hwyhowyoudoin@patates.com";
		int begin2 = email.indexOf("@")+1;
		int end2 = email.indexOf(".c");
		String emailType = email.substring(begin2,end2);
		System.out.println(emailType);
		
		String vale = "ABDCDBABASDBCDA";
		int num6 = vale.lastIndexOf("B");
		System.out.println(num6);
		
		String myemail = "Myemail.school@atmail.com";
		int Begin = myemail.indexOf("@")+1;
		int Ende = myemail.lastIndexOf(".");
		String etype = myemail.substring(Begin,Ende);
		System.out.println(etype);
		
		/*
		  isempty METHOD CHECK IF THE STRING IS EMPTY OR NOT. RETURN THE BOOLEAN EXPRESSION 
		 */
		
		
		
		
		
		
	}
}
