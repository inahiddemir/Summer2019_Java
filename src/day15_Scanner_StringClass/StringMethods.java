package day15_Scanner_StringClass;

public class StringMethods {
	public static void main(String[] args) {
	
		String str = "Cybertek";
// index num:         01234567

			// charAt(index):
		//System.out.println(str.charAt(8));

		
		char ch = str.charAt(4);
		System.out.println(ch);
		
		String str2 = "Mu htar";
		char ch2 = str2.charAt(2);
		
// index nums:        0123456
		
		System.out.println("aaaaaaaaaaaaaaaaaa"+ch2+"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		
		
		//////////// LENGTH /////////////////////
		
		String name = "Donald J Trump";
		int n = name.length();
		System.out.println(n);
		
		// CONCAT METHOD 
		
		String s1 = "Cybertek";
		s1.concat(" School");
		
		System.out.println(s1); // String is immutable.
		
		s1 = s1.concat(" School");	// attempt to modify String s1
		System.out.println(s1);
		
		///////////////////////////TOUPPERCASE////////////////////////
		
		String N = "cybertek";
		
		N.toUpperCase();
		System.out.println(N);
		
		N = N.toUpperCase();
		
		System.out.println(N);
		
		
		
		
		
		
		
		
		
		
}
}
