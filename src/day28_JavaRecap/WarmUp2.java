package day28_JavaRecap;

public class WarmUp2 {

/*	4. write a method that acceps 3 parameters, 2 numbers and one operator
	if operator is not between (-, +, *, /, %) output should be invalid operator
	ex: calculate (10, 2, *) ==> 20
*/
	
	public static void main(String[] args) {
		calculate(10, 20, "*");	
	
		CalculateGrades(75);
	
	
	
	}
	
	public static void calculate(int a, int b, String Ope) {
	
	String result = "";
	
	
	if(Ope.equals("-")) { 
	result+=(a-b);
	
	}else if(Ope.equals("+")) {
	result+=(a+b);
	
	}else if(Ope.equals("*")) {
	result+=(a*b);
	}else if(Ope.equals("/")) {
	result+=(a/b);
	}else if(Ope.equals("%")) {
	result+=(a%b);
	}else {
	System.out.println("bok bok is yapma lan");
	}
	
	String result2=""; 
	
	result2+= (Ope.equals("-"))?(a-b) : (Ope.equals("+"))?(a+b) : (Ope.equals("*"))?(a+b) :(Ope.equals("/"))? (a/b) :(Ope.equals("%"))? (a%b) : "Invalid Operator";
	
	System.out.println(result2);
	}
	


	public static void CalculateGrades(int score) {
		
		char Grade = (score>=90 &&score<=100)?'A':(score>=80 && score<90)?'B':(score>=70 && score <80)?'C':(score>=60 && score<70)?'D':(score>=50 && score <60)?'F':'I';
		
		if(Grade=='I') {
			System.out.println("Invalid Score");
		}else {
			System.out.println(Grade);
		}
	}
























}



























