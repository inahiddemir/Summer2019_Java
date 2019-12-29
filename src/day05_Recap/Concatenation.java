package day05_Recap;

public class Concatenation {

	/*
	 	String: combination of multiple characters. (represents the sequences of characters
	 	, used for storing texts. String values are surrendered by a double quote.
	 	
	 	Concatenation: Combining, linking things togerther. WE use + for this
	 	
	 	
	*/
	public static void main(String[] args) {
		String str = "any text goes here";
		
		System.out.println(str);
		
		String str2 = "1";
		System.out.println(str2);		
		
		String Hello = "Hello World!!";
		System.out.println(Hello);
		
		// Example:
		
		String name = "Nahid";
		System.out.println("My name is"+name);
		String year = "This is "+2019;
		System.out.println(year);
		
		/*
		  cucumber is variable $
		  Tomato is variablename $
		  
		 */
		int cucumber = 3;	int tomato = 5;
		
		System.out.println("cucumber is "+cucumber+"$");
		System.out.println("tomato is "+tomato + "$");
		
		String newStr = "100"+10;
		System.out.println(newStr);
		
		System.out.println(1+2+3);
		System.out.println(1+"2"+3);
		//System.out.println("1"+1-3); // "11"-3  its not working. you cannot substarct from text.
		System.out.println(2-1+1+"4"); // if you start with numbers its ok till string
		
		System.out.println("Batch 12" + (1+2)); // "Batch 12" + 3 ==> Batch 123
		
		System.out.println(1+ "123"+4+5);
		System.out.println("123"+(4+5));
		
		String BookName = "I like the book called \'Game of Thrones\'";
		
		System.out.println(BookName);
		
		
		String MyInfo = "My name is: \n\tCybertek"; 
		System.out.println(MyInfo);
		System.out.println('3' + 3);
		//					51	+	3 ==> 54
		
		System.out.println('3'+3);
		System.out.println("3"+'3'); // after the string char is concated as character.
		
		
		
	}

}
