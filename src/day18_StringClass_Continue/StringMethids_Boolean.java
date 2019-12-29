package day18_StringClass_Continue;

public class StringMethids_Boolean {
	public static void main(String[] args) {
		/*
		   isEmpty() method check if the String is empty or not and return boolean expression
		 */
	String str = "Cybertek";
	boolean R1 = str.isEmpty();
	System.out.println(R1);
	String str2 = "";
	
	if(str2.isEmpty()) {
		System.out.println("its empty string");
	}else {
		System.out.println("its not empty");
	}
	
	String s1 = "JAVA";
	String s2 = new String("java");
	
	System.out.println(s1==s2);  // false different location
	System.out.println(s1.contentEquals(s2)); // false case sensitivity
	System.out.println(s1.equalsIgnoreCase(s2)); // true
	
	System.out.println("===========================================================================");
	
	/*
	 	contains(str): check if the str is ontained in the string or not, then returs a boolean expression
	
		if contain --> true, if not contain --> false
	 */
	
	String name = "Muhtar";
	boolean aa = name.contains("good guy");
	System.out.println(aa);
	boolean bb = name.contains("A");
	System.out.println(bb);
	boolean cc = name.contains("uht");
	System.out.println(cc);
	boolean dd = name.contains("m");
	System.out.println(dd);
	
	System.out.println("==============================================================================");
	
	/*
	  startsWith(str): checks if the string started with str or no then return boolean 
	 */
			
	boolean ff = name.startsWith("M");
	System.out.println(ff);
	boolean gg = name.startsWith("m");
	System.out.println(gg);
	
	System.out.println("==============================================================================");
	
	/*
	 	endsWith(str) checks if the String is ended with the given str or not, then returns boolean expressions
	 */
	
	boolean hh = name.endsWith("r");
	System.out.println(hh);
	boolean ii = name.endsWith("R");
	System.out.println(ii);
	System.out.println(name.endsWith("r"));
	
	
	
	}
}
